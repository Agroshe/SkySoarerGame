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
    private int gameSpeed = 2; //todo: should be set to slow
    private int gameGap = 150; //todo: should be set to easy
    private SkySourer skySourer;
    private PowerTimer[] powerTimer;
    private ArrayList<PipeObstacle> pipeObstacles = new ArrayList<>();
    private PipeSpawner pipeSpawner;

	public GameScene(SkySourerGame skySourerGame) {
		this.skySourerGame = skySourerGame;
	}

    public void setupScene() {
        ScoreText scoreText = new ScoreText(new Coordinate2D(getWidth() / 2, 0));
        scoreText.setAnchorPoint(AnchorPoint.TOP_CENTER);
        pipeSpawner = new PipeSpawner(getHeight(),getWidth(), 2000,gameSpeed, gameGap);
        skySourer = new SkySourer(new Coordinate2D(getWidth() /2, getHeight()/2 ), scoreText, skySourerGame);
    }

    public void setupEntities() {
        PipeObstacle pipeObstacle = new PipeObstacle(gameGap, skySourerGame, gameSpeed, new Coordinate2D(getWidth() / 2, getHeight() / 2));
        addEntity(pipeObstacle);
    }

    public int getScore() {
        return skySourerGame.getScore();
    }

    public void setupEntitySpawners() {
        addEntitySpawner(pipeSpawner);
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

    public void setGap(int gameGap) {
        this.gameGap = gameGap;
    }

    public void setupTimers() {

    }

    public int getGameSpeed() {
        return gameSpeed;
    }
}
