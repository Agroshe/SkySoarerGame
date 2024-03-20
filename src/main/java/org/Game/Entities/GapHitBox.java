package com.github.hanyaeger.tutorial.Game.Entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

public class GapHitBox extends RectangleEntity implements Collider {

	private int hight;

	public GapHitBox(Coordinate2D location) {
        super(location);
    }

}
