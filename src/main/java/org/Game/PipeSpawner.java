package org.Game;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
import org.Game.Entities.PipeObstacle;
import org.Game.Scenes.GameScene;

public class PipeSpawner extends EntitySpawner {

    private double sceneHeight;
    private double sceneWidth;
    private double gameSpeed;
    private int gameGap;

    public PipeSpawner(double sceneHeight, double sceneWidth, int interval, double gameSpeed, int gameGap) {
        super(interval);
        this.sceneHeight = sceneHeight;
        this.sceneWidth = sceneWidth;
        this.gameSpeed = gameSpeed;
        this.gameGap = gameGap;
    }

    @Override
    protected void spawnEntities() {
        var pipeObstacle = new PipeObstacle(
                gameGap,
                gameSpeed,
                new Coordinate2D(
                        sceneWidth - 1,
                        ((Math.random() * ((sceneHeight - 200) - 200)) + 200) - (sceneHeight + (gameGap / 2.0))
                ),
                sceneHeight
        );
        spawn(pipeObstacle);
    }
}

