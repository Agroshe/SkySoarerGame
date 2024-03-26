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
        pipeSpawner = new PipeSpawner(getHeight(),getWidth(), 2000,gameSpeed, gameGap);
    }

    public void setupEntities() {
        ScoreText scoreText = new ScoreText(new Coordinate2D(getWidth() / 2, 0));
        skySourer = new SkySourer(new Coordinate2D(150, getHeight()/2 ), scoreText, skySourerGame);
        addEntity(scoreText);
        addEntity(skySourer);
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
        skySourer.setScoreMultiplier(scoreMultiplier);
    }

    public void setSpeed(int gameSpeed) {
        this.gameSpeed = gameSpeed;
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
