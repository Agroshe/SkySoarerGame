package com.github.hanyaeger.tutorial.Game.Entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.Game.SkySourerGame;

public class PipeObstacle extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {

	private int hight;

	private int gap;

	private SkySourerGame skySourerGame;

	private Pipe topPipe;

	private Pipe bottomPipe;

	private GapHitBox gapHitBox;

	public PipeObstacle(int hight, int gameGap, SkySourerGame skySourerGame, int gameSpeed, Coordinate2D location) {
        super(location);
    }

	protected void setupEntities() {

	}

	public void setSpeed(int gameSpeed) {

	}

	@Override
	public void notifyBoundaryCrossing(SceneBorder border) {

	}
}
