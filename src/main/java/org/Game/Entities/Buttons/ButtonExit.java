package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.input.MouseButton;
import org.Game.SkySourerGame;

public class ButtonExit extends Button {

    private final SkySourerGame skySourerGame;


    public ButtonExit(int width, int height, Coordinate2D location, SkySourerGame skySourerGame) {
        super(width, height, location, "Exit");
        this.skySourerGame = skySourerGame;
    }


    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
        skySourerGame.quit();
    }
}
