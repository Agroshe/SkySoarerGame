package org.Game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
import org.Game.Entities.PipeObstacle;
import org.Game.Entities.Powerups.PowerDoublePoints;
import org.Game.Entities.Powerups.PowerTransparancy;
import org.Game.Scenes.GameScene;

public class PowerSpawner extends EntitySpawner {

    private double sceneHight;

    private double sceneWidth;

    private int gameGap;

    private double gameSpeed;

    private GameScene gameScene;
    private SkySourerGame skySourerGame;

    public PowerSpawner(double sceneHight, double sceneWidth, int interval, int gameSpeed, int gameGap) {
        super(interval);
        this.sceneHight = sceneHight;
        this.sceneWidth = sceneWidth;
        this.gameSpeed = gameSpeed;
        this.gameGap = gameGap;
    }

    @Override
    protected void spawnEntities() {
        var powerDoublePoints = new PowerDoublePoints();
        var powerTransparancy = new PowerTransparancy();
        double randomDouble = Math.random() * 100;
        if (randomDouble <= 7) {
            spawn(powerDoublePoints);
        } else if (randomDouble >= 93) {
            spawn(powerTransparancy);
        }
    }
}
