package org.Game.Entities;


import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import org.Game.SkySourerGame;

public class PipeObstacle extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {

    private int gap;
    private double sceneHeight;
    private Pipe topPipe;
    private Pipe bottomPipe;
    private GapHitBox gapHitBox;

    public PipeObstacle(int gameGap, double gameSpeed, Coordinate2D location, double sceneHeight) {
        super(location);
        setMotion(gameSpeed, 270d);
        this.gap = gameGap;
        this.sceneHeight = sceneHeight;
    }

    protected void setupEntities() {
        topPipe = new Pipe(new Coordinate2D(0, 0), "sprites/buisje2.png", sceneHeight);
        //topPipe.setAnchorPoint(AnchorPoint.BOTTOM_LEFT);
        gapHitBox = new GapHitBox(new Coordinate2D(0, sceneHeight), gap);
        bottomPipe = new Pipe(new Coordinate2D(0, gap + sceneHeight), "sprites/buisje.png", sceneHeight);
        //bottomPipe.setAnchorPoint(AnchorPoint.TOP_LEFT);

        //gapHitBox.setAnchorPoint(AnchorPoint.CENTER_RIGHT);
        addEntity(gapHitBox);
        addEntity(bottomPipe);
        addEntity(topPipe);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        this.remove();
    }
}
