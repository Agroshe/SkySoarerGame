package org.Game.Entities.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class KnopBox extends RectangleEntity {

	public KnopBox(int width, int height, Coordinate2D location) {
        super(location);
        setWidth(width);
        setHeight(height);
        setFill(Color.BLACK);
    }

}
