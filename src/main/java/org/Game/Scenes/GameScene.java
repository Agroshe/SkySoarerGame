package com.github.hanyaeger.tutorial.Game.Scenes;


import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Game.Entities.SkySourer;
import com.github.hanyaeger.tutorial.Game.PowerTimer;
import com.github.hanyaeger.tutorial.Game.SkySourerGame;

public class GameScene extends DynamicScene implements EntitySpawnerContainer, TimerContainer {

	private SkySourerGame skySourerGame;

	private int gameSpeed;

	private int gameGap;

	private SkySourer skySourer;

	private PowerTimer[] powerTimer;

	public GameScene(SkySourerGame skySourerGame, int gameSpeed, int gameGap) {

	}

	public void setupScene() {

	}

	public void setupEntities() {

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

	public void setSpeed(int gameSpeed) {

	}

	public void setupTimers() {

	}

	public int getGameSpeed() {
		return gameSpeed;
	}
}
