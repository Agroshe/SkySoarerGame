package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.Game.SkySourerGame;
import javafx.scene.input.MouseButton;


public class ButtonStartGame extends Button {

	private SkySourerGame skySourerGame;

	public ButtonStartGame(int width, int height, Coordinate2D location, SkySourerGame skySourerGame) {
        super(width, height, location, "Speel game");
		this.skySourerGame = skySourerGame;
    }

	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
		skySourerGame.setActiveScene(1);
	}
}
