package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import org.Game.SkySourerGame;
import javafx.scene.input.MouseButton;


public class ButtonGap extends Button {

	private SkySourerGame skySourerGame;

	public ButtonGap(int width, int height, Coordinate2D location, String text, int gap) {
		super(width, height, location, text);
	}

	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {

	}

	@Override
	protected void setupEntities() {

	}

}
