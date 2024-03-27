package org.Game.Entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import org.Game.SkySourerGame;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class SkySourer extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian, Collided, Collider, Rotatable {

    private int score;
    private boolean collision;
    private int scoreMultiplier;
    private SkySourerGame skySourerGame;
    private ScoreText scoreText;
    private long previousMillis = 0;
    private double sceneHeight;

    public SkySourer(Coordinate2D location, ScoreText scoreText, SkySourerGame skySourerGame, double sceneHeight) {
        super("sprites/FlappyBird.png", location, new Size(sceneHeight * 0.083));
        this.scoreText = scoreText;
        this.skySourerGame = skySourerGame;
        collision = true;
        score = 0;
        scoreMultiplier = 1;
        this.sceneHeight = sceneHeight;
        setGravityConstant(sceneHeight * 0.0004);
    }


    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if (collider instanceof Pipe && collision) {
                skySourerGame.handleDeath(score);
            } else if (collider instanceof GapHitBox && System.currentTimeMillis() - 300 >= previousMillis) {
                previousMillis = System.currentTimeMillis();
                score += scoreMultiplier;
                scoreText.setScoreText(score);
            }
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.SPACE)) {
            setMotion(sceneHeight * 0.012, 180);
        } else if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(sceneHeight * 0.012, 180);
        } else if (pressedKeys.contains(KeyCode.W)) {
            setMotion(sceneHeight * 0.012, 180);
        }
    }

    public int getScore() {
        return score;
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }

    public void setScoreMultiplier(int multiplier) {
        this.scoreMultiplier = multiplier;
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        setSpeed(0);
        switch (border) {
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                break;
            case TOP:
                setAnchorLocationY(1);
                break;
        }
    }
}
