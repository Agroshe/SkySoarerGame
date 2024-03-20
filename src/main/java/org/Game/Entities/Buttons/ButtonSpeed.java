package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import org.Game.Scenes.StartScene;
import org.Game.SkySourerGame;
import javafx.scene.input.MouseButton;


public class ButtonSpeed extends Button {

	private StartScene startScene;
	private int speed;

	public ButtonSpeed(int width, int height, Coordinate2D location, String text, StartScene startScene, int speed) {
		super(width, height, location, text);
		this.startScene = startScene;
		this.speed = speed;
	}


	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
		startScene.setSpeed(speed);

	}
}
