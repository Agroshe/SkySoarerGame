package org.Game.Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

public class compositeObstacle extends DynamicCompositeEntity {
	public compositeObstacle(Coordinate2D location) {
        super(location);
		setMotion(0.1, 270d);
    }
	@Override
	protected void setupEntities() {
		//als hier een van de twee hitboxen op 0,0 gezet wordt werkt de hitbox correct.
		hitBox hitBox = new hitBox(new Coordinate2D(0,50));
		addEntity(hitBox);
		hitBox hitBox2 = new hitBox(new Coordinate2D(20,70));
		addEntity(hitBox2);
	}
}
