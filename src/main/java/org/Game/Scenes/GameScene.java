package org.Game.Scenes;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.Game.Entities.PipeObstacle;
import org.Game.Entities.SkySourer;
import org.Game.PowerTimer;
import org.Game.SkySourerGame;

public class GameScene extends DynamicScene implements EntitySpawnerContainer, TimerContainer {

	private SkySourerGame skySourerGame;

	private int gameSpeed;

	private int gameGap;

	private SkySourer skySourer;

	private PowerTimer[] powerTimer;


	public GameScene(SkySourerGame skySourerGame) {
		this.skySourerGame = skySourerGame;

	}

	public void setupScene() {

	}

	public void setupEntities() {
		PipeObstacle pipeObstacle = new PipeObstacle(gameGap, skySourerGame, gameSpeed, new Coordinate2D(getWidth()/2,getHeight() / 2));
		addEntity(pipeObstacle);
	}

	public int getScore() {
		return 0;
	}

	public void setupEntitySpawners() {

	}

	public void setCollision(boolean collision) {

	}

	public void setScoreMultiplier(int scoreMultiplier) {

	}

	public void setSpeed(int speed) {
		gameSpeed = speed;
		System.out.println(gameSpeed);
	}

	public void setGap(int gap) {
		gameGap = gap;
	}

	public void setupTimers() {

	}

	public int getGameSpeed() {
		return gameSpeed;
	}
}
