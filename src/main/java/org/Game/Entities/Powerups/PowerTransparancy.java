package org.Game.Entities.Powerups;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import org.Game.Entities.Power;
import org.Game.Scenes.GameScene;

import java.util.List;

public class PowerTransparancy extends Power {

	public PowerTransparancy(Coordinate2D location, GameScene gameScene) {
        super(location, gameScene.getGameSpeed(), gameScene, "todo");
    }


	@Override
	public void onCollision(List<Collider> collidingObjects) {

	}

	@Override
	public void notifyBoundaryCrossing(SceneBorder border) {

	}
}
