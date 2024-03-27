package org.Game.Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class HitBuis extends RectangleEntity implements Collider {
    public HitBuis(final Coordinate2D initialPosition) {
        super(initialPosition);
        setWidth(60);
        setHeight(40);
        //setFill(Color.TRANSPARENT);
        setFill(Color.RED);
    }
}
