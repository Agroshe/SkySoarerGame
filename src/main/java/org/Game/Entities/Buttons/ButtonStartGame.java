package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.input.MouseButton;
import org.Game.SkySourerGame;


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
