package org.Game.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.Game.Entities.Buttons.ButtonMainMenu;
import org.Game.Entities.TextBox;
import org.Game.SkySourerGame;

public class DeathScene extends StaticScene {

	private SkySourerGame skySourerGame;

	public DeathScene(SkySourerGame skySourerGame) {
		this.skySourerGame = skySourerGame;
	}

	public void setupScene() {

	}

	public void setupEntities() {
		var textScore = new TextEntity(
				new Coordinate2D(getWidth() /2 ,100), "Score");

		var textLastScore = new TextEntity(
				new Coordinate2D(getWidth() /2 ,183), "" + skySourerGame.getScore());

		var rectangleScore = new TextBox(
				150, 60, new Coordinate2D(getWidth() /2 ,183));

		var textHighScore = new TextEntity(
				new Coordinate2D(getWidth() /2 ,350), "Highscore");

		var textHighesScore = new TextEntity(
				new Coordinate2D(getWidth() /2 ,400), "" + skySourerGame.getHighscore());

		var rectangleHighScore = new TextBox(
				150, 60, new Coordinate2D(getWidth() /2 ,400));

		var buttonRestart = new ButtonMainMenu(
				250, 60, new Coordinate2D(getWidth() /2 ,500), "Terug naar hoofdmenu", skySourerGame
		);

		textScore.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		textScore.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		textLastScore.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		textLastScore.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		textHighScore.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		textHighScore.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		textHighesScore.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		textHighesScore.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		//buttonRestart.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		rectangleScore.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		rectangleScore.setFill(Color.WHITE);
		rectangleScore.setStrokeColor(Color.BLACK);
		rectangleHighScore.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		rectangleHighScore.setFill(Color.WHITE);
		rectangleHighScore.setStrokeColor(Color.BLACK);



		addEntity(textScore);
		addEntity(rectangleScore);
		addEntity(textLastScore);
		addEntity(rectangleHighScore);
		addEntity(textHighScore);
		addEntity(textHighesScore);
		addEntity(buttonRestart);
	}


}
