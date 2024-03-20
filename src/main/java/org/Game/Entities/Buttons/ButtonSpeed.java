package com.github.hanyaeger.tutorial.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Game.SkySourerGame;
import javafx.scene.input.MouseButton;


public class ButtonSpeed extends Button {

	private SkySourerGame skySourerGame;

	public ButtonSpeed(int width, int height, Coordinate2D location, String text) {
		super(width, height, location, text);
	}

	@Override
	protected void setupEntities() {

	}

	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {

	}
}
