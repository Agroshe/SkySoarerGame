package org.Game.Scenes;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.Timer;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.Game.Entities.PipeObstacle;
import org.Game.Entities.Power;
import org.Game.Entities.Powerups.PowerDoublePoints;
import org.Game.Entities.Powerups.PowerSpeed;
import org.Game.Entities.Powerups.PowerTransparancy;
import org.Game.Entities.Powerups.PowerVergroting;
import org.Game.Entities.ScoreText;
import org.Game.Entities.SkySourer;
import org.Game.PipeSpawner;
import org.Game.PowerSpawner;
import org.Game.PowerTimer;
import org.Game.SkySourerGame;

import java.util.ArrayList;

public class GameScene extends DynamicScene implements EntitySpawnerContainer, TimerContainer {

    private SkySourerGame skySourerGame;
    private double gameSpeed;
    private int gameGap;
    private SkySourer skySourer;
    private Timer powerTimerDubbelPoints;
    private Timer powerTimerTransparancy;
    private Timer powerTimerVergroting;
    private Timer powerTimerSpeed;
    private final String dubblePoints = "powerDoublePoints";
    private final String powerSpeed = "powerSpeed";
    private final String powerTransparancy  = "powerTransparancy";
    private final String powerVergroting  = "powerVergroting";
    private PipeSpawner pipeSpawner;

    private PowerSpawner powerSpawner;

    public GameScene(SkySourerGame skySourerGame, double sceneHeight) {
        this.skySourerGame = skySourerGame;
        gameGap = (int) (sceneHeight * 0.4);
        gameSpeed = 4;
    }

    public void setupScene() {
        pipeSpawner = new PipeSpawner(getHeight(), getWidth(), (int) (6000 / gameSpeed), gameSpeed, gameGap);
        powerSpawner = new PowerSpawner(getHeight(), getWidth(), (int) (6000 / gameSpeed), gameSpeed, gameGap,this);
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
        addEntitySpawner(powerSpawner);
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
        powerTimerDubbelPoints = new PowerTimer(dubblePoints,this);
        powerTimerTransparancy = new PowerTimer(powerTransparancy,this);
        powerTimerVergroting = new PowerTimer(powerVergroting,this);
        powerTimerSpeed = new PowerTimer(powerSpeed,this);
        addTimer(powerTimerDubbelPoints);
        addTimer(powerTimerTransparancy);
        addTimer(powerTimerVergroting);
        addTimer(powerTimerSpeed);
        powerTimerDubbelPoints.pause();
        powerTimerTransparancy.pause();
        powerTimerVergroting.pause();
        powerTimerSpeed.pause();
    }

    public void startPowerTimer(Power namePower) {
        if(namePower instanceof PowerDoublePoints) {
            powerTimerDubbelPoints.resume();
        }else if (namePower instanceof PowerTransparancy) {
            powerTimerTransparancy.resume();
        } else if (namePower instanceof PowerVergroting) {
            powerTimerVergroting.resume();
        } else if (namePower instanceof PowerSpeed) {
            powerTimerSpeed.resume();
        }
    }

    public double getGameSpeed() {
        return gameSpeed;

    }
}
