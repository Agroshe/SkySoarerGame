package org.Game;


import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.core.entities.EntityCollection;
import com.google.inject.Injector;
import javafx.scene.layout.Pane;
import org.Game.Scenes.GameScene;

import java.util.List;

public class PipeSpawner extends EntitySpawner implements EntitySpawnerContainer {

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

	@Override
	public void setupEntitySpawners() {

	}

	@Override
	public Injector getInjector() {
		return null;
	}

	@Override
	public Pane getRootPane() {
		return null;
	}

	@Override
	public EntityCollection getEntityCollection() {
		return null;
	}

	@Override
	public List<EntitySpawner> getSpawners() {
		return null;
	}
}
