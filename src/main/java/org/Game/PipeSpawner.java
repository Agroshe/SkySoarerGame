package org.Game;



import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.core.entities.EntityCollection;
import com.google.inject.Injector;
import javafx.scene.layout.Pane;
import org.Game.Entities.PipeObstacle;
import org.Game.Scenes.GameScene;

import java.util.List;

public class PipeSpawner extends EntitySpawner {

	private double sceneHight;
	private double sceneWidth;
	private int gameSpeed;
	private int gameGap;

	private GameScene gameScene;
	private SkySourerGame skySourerGame;

	public PipeSpawner(double sceneHight, double sceneWidth, int interval, int gameSpeed, int gameGap) {
		super(interval);
	}

	@Override
	protected void spawnEntities() {
		var pipeObstacle = new PipeObstacle(gameGap, skySourerGame, gameSpeed, new Coordinate2D(0,0));
		spawn(pipeObstacle);
	}
}

