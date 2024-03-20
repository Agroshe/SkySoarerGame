package org.Game.Scenes;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import org.Game.Entities.Buttons.ButtonStartGame;
import org.Game.SkySourerGame;

public class StartScene extends StaticScene {

	private SkySourerGame skySourerGame;

	private int gameSpeed;

	private int gameGap;


	public StartScene(SkySourerGame skySourerGame, int speed, int gap) {
		this.skySourerGame = skySourerGame;
        this.gameSpeed = speed;
        this.gameGap = gap;
	}

	public void setupScene() {

	}

	public void setupEntities() {

	}

	public void setSpeed(int speed) {

	}

	public void setGap(int gap) {

	}

	public int getSpeed() {
		return 0;
	}

	public int getGap() {
		return 0;
	}

}
