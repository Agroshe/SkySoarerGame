package org.Game.Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class GapHitBox extends RectangleEntity implements Collider {
	public GapHitBox(final Coordinate2D location) {
        super(location);
        setWidth(20);
        setHeight(100);
        setFill(Color.ORANGE);
    }
}
