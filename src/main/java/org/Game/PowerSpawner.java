package org.Game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
import org.Game.Entities.Powerups.PowerDoublePoints;
import org.Game.Entities.Powerups.PowerTransparancy;
import org.Game.Scenes.GameScene;

public class PowerSpawner extends EntitySpawner {

    private double sceneHeight;
    private double sceneWidth;
    private int gameGap;
    private double gameSpeed;
    private GameScene gameScene;
    private SkySourerGame skySourerGame;

    public PowerSpawner(double sceneHeight, double sceneWidth, int interval, double gameSpeed, int gameGap, GameScene gamescene) {
        super(interval);
        this.gameScene = gamescene;
        this.sceneHeight = sceneHeight;
        this.sceneWidth = sceneWidth;
        this.gameSpeed = gameSpeed;
        this.gameGap = gameGap;
    }

    @Override
    protected void spawnEntities() {
        var powerDoublePoints = new PowerDoublePoints(new Coordinate2D(sceneWidth + 100, ((Math.random() * ((sceneHeight - 200) - 200)) + 200) - 100),gameScene);
        var powerTransparancy = new PowerTransparancy(new Coordinate2D(sceneWidth + 100, ((Math.random() * ((sceneHeight - 200) - 200)) + 200) - 100),gameScene);
        double randomDouble = Math.random() * 100;
        if (randomDouble <= 7) {
            spawn(powerDoublePoints);
        } else if (randomDouble >= 93) {
            spawn(powerTransparancy);
        }
    }
}
