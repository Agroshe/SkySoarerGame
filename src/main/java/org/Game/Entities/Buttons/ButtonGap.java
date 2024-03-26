package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import org.Game.Scenes.StartScene;
import org.Game.SkySourerGame;
import javafx.scene.input.MouseButton;


public class ButtonGap extends Button {
    private final StartScene startScene;
    private int gap;

    public ButtonGap(int width, int height, Coordinate2D location, String text, int gap, StartScene startScene) {
        super(width, height, location, text);
        this.startScene = startScene;
        this.gap = gap;
    }

    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
        startScene.setGap(gap);
    }

}
