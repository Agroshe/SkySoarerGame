package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.input.MouseButton;
import org.Game.SkySourerGame;


public class ButtonMainMenu extends Button {

    private SkySourerGame skySourerGame;

    public ButtonMainMenu(int width, int height, Coordinate2D location, String text, SkySourerGame skySourerGame) {
        super(width, height, location, text);
        this.skySourerGame = skySourerGame;
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
        skySourerGame.setActiveScene(0);
    }
}
