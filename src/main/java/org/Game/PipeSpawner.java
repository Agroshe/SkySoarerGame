package org.Game;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
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
        this.sceneHight = sceneHight;
        this.sceneWidth = sceneWidth;
        this.gameSpeed = gameSpeed;
        this.gameGap = gameGap;
    }

    @Override
    protected void spawnEntities() {
        var pipeObstacle = new PipeObstacle(gameGap, skySourerGame, gameSpeed, new Coordinate2D(sceneWidth, sceneHight / 2));
        spawn(pipeObstacle);
    }
}

