package org.Game.Scenes;


import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.Game.Entities.PipeObstacle;
import org.Game.Entities.ScoreText;
import org.Game.Entities.SkySourer;
import org.Game.PipeSpawner;
import org.Game.PowerTimer;
import org.Game.SkySourerGame;

import java.util.ArrayList;

public class GameScene extends DynamicScene implements EntitySpawnerContainer, TimerContainer {

    private SkySourerGame skySourerGame;
    private double gameSpeed;
    private int gameGap;
    private SkySourer skySourer;
    private PowerTimer[] powerTimer;
    private ArrayList<PipeObstacle> pipeObstacles = new ArrayList<>();
    private PipeSpawner pipeSpawner;

    public GameScene(SkySourerGame skySourerGame, double sceneHeight) {
        this.skySourerGame = skySourerGame;
        gameGap = (int) (sceneHeight * 0.4);
        gameSpeed = 2;
    }

    public void setupScene() {
        pipeSpawner = new PipeSpawner(getHeight(), getWidth(), (int) (2000 / gameSpeed), gameSpeed, gameGap);
    }

    public void setupEntities() {
        ScoreText scoreText = new ScoreText(new Coordinate2D(getWidth() / 2, 0));
        skySourer = new SkySourer(new Coordinate2D(getWidth() * 0.15, getHeight() / 2), scoreText, skySourerGame, getHeight());
        addEntity(scoreText);
        addEntity(skySourer);
    }

    public int getScore() {
        return skySourer.getScore();
    }

    public void setupEntitySpawners() {
        addEntitySpawner(pipeSpawner);
    }

    public void setCollision(boolean collision) {
        skySourer.setCollision(collision);
    }

    public void setScoreMultiplier(int scoreMultiplier) {
        skySourer.setScoreMultiplier(scoreMultiplier);
    }

    public void setSpeed(double gameSpeed) {
        this.gameSpeed = gameSpeed;
    }

    public void setGap(int gameGap) {
        this.gameGap = gameGap;
    }

    public void setupTimers() {

    }

    public double getGameSpeed() {
        return gameSpeed;
    }
}
