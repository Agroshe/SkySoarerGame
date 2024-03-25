package org.Game.Scenes;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.Game.Entities.PipeObstacle;
import org.Game.Entities.SkySourer;
import org.Game.PowerTimer;
import org.Game.SkySourerGame;

import java.util.ArrayList;

public class GameScene extends DynamicScene implements EntitySpawnerContainer, TimerContainer {

    private SkySourerGame skySourerGame;
    private int gameSpeed;
    private int gameGap;
    private SkySourer skySourer;
    private PowerTimer[] powerTimer;
    private ArrayList<PipeObstacle> pipeObstacles = new ArrayList<>();

    public GameScene(SkySourerGame skySourerGame, int gameSpeed, int gameGap) {
        this.skySourerGame = skySourerGame;
        this.gameSpeed = gameSpeed;
        this.gameGap = gameGap;
    }

    public void setupScene() {

    }

    public void setupEntities() {
        PipeObstacle pipeObstacle = new PipeObstacle(gameGap, skySourerGame, gameSpeed, new Coordinate2D(getWidth() / 2, getHeight() / 2));
        addEntity(pipeObstacle);
    }

    public int getScore() {
        return 0;
    }

    public void setupEntitySpawners() {

    }

    public void setCollision(boolean collision) {
        skySourer.setCollision(collision);
    }

    public void setScoreMultiplier(int scoreMultiplier) {
        skySourer.setScoreMulitplier(scoreMultiplier);
    }

    public void setSpeed(int gameSpeed) {
        this.gameSpeed = gameSpeed;
        skySourer.setSpeed(gameSpeed);
        for (PipeObstacle pipeObstacle : pipeObstacles) {
            pipeObstacle.setSpeed(gameSpeed);
        }
    }

    public void setupTimers() {

    }

    public int getGameSpeed() {
        return gameSpeed;
    }
}
