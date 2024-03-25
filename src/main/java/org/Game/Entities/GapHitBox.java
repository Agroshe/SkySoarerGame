package org.Game.Entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

public class GapHitBox extends RectangleEntity implements Collider {

	public GapHitBox(Coordinate2D location, int gap) {
        super(location);
        setWidth(2);
        setHeight(gap);
    }

}
