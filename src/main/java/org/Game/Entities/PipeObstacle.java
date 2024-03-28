package org.Game.Entities;



import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

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
        gapHitBox = new GapHitBox(new Coordinate2D(0, sceneHeight), gap);
        bottomPipe = new Pipe(new Coordinate2D(0, gap + sceneHeight), "sprites/buisje.png", sceneHeight);
        addEntity(gapHitBox);
        addEntity(bottomPipe);
        addEntity(topPipe);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        this.remove();
    }
}
