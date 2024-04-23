package org.Game.Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class hitBox extends RectangleEntity implements Collider {
	public hitBox(final Coordinate2D location) {
        super(location);
        setWidth(20);
        setHeight(100);
        setFill(Color.ORANGE);
    }
}
