package org.Game.Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

public class PipeObstacle extends DynamicCompositeEntity {
	public PipeObstacle(Coordinate2D location) {
        super(location);
		setMotion(0.1, 270d);
    }
	@Override
	protected void setupEntities() {
		GapHitBox gapHitBox = new GapHitBox(new Coordinate2D(0,50));
		addEntity(gapHitBox);
		GapHitBox gapHitBox2 = new GapHitBox(new Coordinate2D(20,50));
		addEntity(gapHitBox2);
		WitBuis gb = new WitBuis(new Coordinate2D(0, 0));
		addEntity(gb);
	}
}
