package org.Game.Entities;


import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import org.Game.SkySourerGame;

public class PipeObstacle extends DynamicCompositeEntity implements SceneBorderCrossingWatcher{

	private int gap;
	private SkySourerGame skySourerGame;
	private double sceneHeight;
	private Pipe topPipe;
	private Pipe bottomPipe;
	private GapHitBox gapHitBox;

	public PipeObstacle(int gameGap, SkySourerGame skySourerGame, double gameSpeed, Coordinate2D location, double sceneHeight) {
        super(location);
		setMotion(gameSpeed, 270d);
		this.gap = gameGap;
		this.skySourerGame = skySourerGame;
	    this.sceneHeight = sceneHeight;
	}

	protected void setupEntities() {
		bottomPipe = new Pipe(new Coordinate2D(0, 0 + (((double) gap) / 2)), "sprites/buisje.png", sceneHeight);
		bottomPipe.setAnchorPoint(AnchorPoint.TOP_LEFT);
		topPipe = new Pipe(new Coordinate2D(0,0 - (((double) gap) / 2)), "sprites/buisje2.png", sceneHeight);
		topPipe.setAnchorPoint(AnchorPoint.BOTTOM_LEFT);
		gapHitBox = new GapHitBox(new Coordinate2D(0,0), gap);
		gapHitBox.setAnchorPoint(AnchorPoint.CENTER_RIGHT);
		addEntity(bottomPipe);
		addEntity(topPipe);
		addEntity(gapHitBox);
	}

	@Override
	public void notifyBoundaryCrossing(SceneBorder border) {
		this.remove();
	}
}
