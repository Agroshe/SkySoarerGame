package org.Game.Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;


public class Pipe extends SpriteEntity implements Collider {

	public Pipe(Coordinate2D location, String fileName) {
        super(fileName, location, new Size(0,700));
    }

}
