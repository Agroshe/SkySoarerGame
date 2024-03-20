package com.github.hanyaeger.tutorial.Game.Entities.Powerups;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.Game.Entities.Power;
import com.github.hanyaeger.tutorial.Game.Scenes.GameScene;
import com.github.hanyaeger.tutorial.Game.SkySourerGame;

import java.util.List;

public class PowerDoublePoints extends Power {

	protected PowerDoublePoints(Coordinate2D location, GameScene gameScene) {
		super(location, gameScene.getGameSpeed(), gameScene, "todo");
	}


	@Override
	public void onCollision(List<Collider> collidingObjects) {

	}

	@Override
	public void notifyBoundaryCrossing(SceneBorder border) {

	}
}
