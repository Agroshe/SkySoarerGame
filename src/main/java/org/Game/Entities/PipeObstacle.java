package org.Game.Entities;


import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import org.Game.SkySourerGame;
import java.util.Random;

public class PipeObstacle extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {

	private int gap;

	private SkySourerGame skySourerGame;

	private Pipe topPipe;

	private Pipe bottomPipe;

	private GapHitBox gapHitBox;

	public PipeObstacle(int gameGap, SkySourerGame skySourerGame, int gameSpeed, Coordinate2D location) {
        super(location);
		setMotion(gameSpeed, 270d);
		this.gap = gameGap;
		this.skySourerGame = skySourerGame;
    }

	protected void setupEntities() {
		bottomPipe = new Pipe(new Coordinate2D(0, 0 + (((double) gap) / 2)), "sprites/buis.png");
		bottomPipe.setAnchorPoint(AnchorPoint.TOP_LEFT);
		topPipe = new Pipe(new Coordinate2D(0,0 - (((double) gap) / 2)), "sprites/buis2.png");
		topPipe.setAnchorPoint(AnchorPoint.BOTTOM_LEFT);
		gapHitBox = new GapHitBox(new Coordinate2D(0,0), gap);
		gapHitBox.setAnchorPoint(AnchorPoint.CENTER_RIGHT);
		addEntity(bottomPipe);
		addEntity(topPipe);
		addEntity(gapHitBox);
	}

	public void setSpeed(int gameSpeed) {
		setMotion(gameSpeed, 270d);
	}

	@Override
	public void notifyBoundaryCrossing(SceneBorder border) {
		//todo: remove this from the pipe list
	}
}
