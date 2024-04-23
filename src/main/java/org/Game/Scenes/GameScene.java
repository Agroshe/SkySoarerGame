package org.Game.Scenes;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.Game.Entities.compositeObstacle;

public class GameScene extends DynamicScene {


	@Override
	public void setupScene() {
	}

	public void setupEntities() {
		compositeObstacle compositeObstacle = new compositeObstacle(new Coordinate2D(450,450));
		addEntity(compositeObstacle);
	}
}
