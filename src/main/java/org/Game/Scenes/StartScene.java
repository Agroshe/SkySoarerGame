package org.Game.Scenes;


import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import org.Game.Entities.Buttons.ButtonExit;
import org.Game.Entities.Buttons.ButtonGap;
import org.Game.Entities.Buttons.ButtonSpeed;
import org.Game.Entities.Buttons.ButtonStartGame;
import org.Game.SkySourerGame;

public class StartScene extends StaticScene {

	private SkySourerGame skySourerGame;

	private int gameSpeed;

	private int gameGap;
	//private GameScene gameScene = new GameScene(skySourerGame);


	public StartScene(SkySourerGame skySourerGame) {
		this.skySourerGame = skySourerGame;
	}

	public void setupScene() {

	}

	public void setupEntities() {

		var exitButton = new ButtonExit(
				35,35, new Coordinate2D(getWidth() - (double)35/2 , (double) 35 /2), skySourerGame
		);
		var textGameNaam = new TextEntity(
				new Coordinate2D(getWidth()/2, 5), "Sky Sourer");
		var textSpeed = new TextEntity(
				new Coordinate2D(getWidth()/2 , getHeight()/2 - 150), "Snelheid");
		var buttonSpeedSlow = new ButtonSpeed(
				100,60, new Coordinate2D(getWidth()/2 - 100 , getHeight()/2 - 100), "Langzaam", this, (int)(getWidth() * 0.005)
		);
		var buttonSpeedAverage = new ButtonSpeed(
				100,60, new Coordinate2D(getWidth()/2 , getHeight()/2 - 100), "Gemiddeld", this, (int)(getWidth() * 0.009)
		);
		var buttonSpeedFast = new ButtonSpeed(
				100,60, new Coordinate2D(getWidth()/2 + 100, getHeight()/2 - 100), "Snel", this, (int)(getWidth() * 0.015)
		);

		var textGap = new TextEntity(
				new Coordinate2D(getWidth()/2, getHeight()/2 + 50), "Gap groote");

		var buttonGapBig = new ButtonGap(
				100,60, new Coordinate2D(getWidth()/2 - 100, getHeight()/2 + 100 ), "Groot", (int)(getHeight() * 0.357), this
		);
		var buttonGapAverage = new ButtonGap(
				100,60, new Coordinate2D(getWidth()/2 , getHeight()/2 + 100), "Gemiddeld", (int)(getHeight() * 0.2428),this
		);
		var buttonGapSmall = new ButtonGap(
				100,60, new Coordinate2D(getWidth()/2 + 100, getHeight()/2 + 100), "Klein", (int)(getHeight() * 0.1714),this
		);

		var buttonStartGame = new ButtonStartGame(
				100, 60, new Coordinate2D(getWidth()/2, getHeight()/2 + 225), skySourerGame
		);

		textGap.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		textSpeed.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		textGameNaam.setAnchorPoint(AnchorPoint.CENTER_CENTER);

		addEntity(exitButton);
		addEntity(textGameNaam);
		addEntity(textSpeed);
		addEntity(buttonSpeedSlow);
		addEntity(buttonSpeedAverage);
		addEntity(buttonSpeedFast);
		addEntity(textGap);
		addEntity(buttonGapBig);
		addEntity(buttonGapAverage);
		addEntity(buttonGapSmall);
		addEntity(buttonStartGame);
	}

	public void setSpeed(int speed) {
		gameSpeed = speed;
	}

	public void setGap(int gap) {
		gameGap = gap;
	}

	public int getSpeed() {
		return gameSpeed;
	}

	public int getGap() {
		return gameGap;
	}

}
