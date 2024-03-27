package org.Game.Scenes;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import org.Game.Entities.Buis;
import org.Game.Entities.PipeObstacle;

public class GameScene extends DynamicScene {


	@Override
	public void setupScene() {

	}

	public void setupEntities() {
		Buis b = new Buis(new Coordinate2D(getWidth(), 300));
		addEntity(b);
		PipeObstacle pipeObstacle = new PipeObstacle(new Coordinate2D(450,450));
		addEntity(pipeObstacle);
	}
}
