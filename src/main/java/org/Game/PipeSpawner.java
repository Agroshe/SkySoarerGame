package org.Game;


import com.github.hanyaeger.api.entities.EntitySpawner;
import org.Game.Scenes.GameScene;

public class PipeSpawner extends EntitySpawner {

	private double sceneHight;
	private double sceneWidth;
	private int gameSpeed;
	private int gameGap;

	private GameScene gameScene;

	public PipeSpawner(double sceneHight, double sceneWidth, int interval, int gameSpeed, int gameGap) {
        super(interval);
    }

	@Override
	protected void spawnEntities() {

	}
}
