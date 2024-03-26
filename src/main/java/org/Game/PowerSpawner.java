package org.Game;

import com.github.hanyaeger.api.entities.EntitySpawner;

public class PowerSpawner extends EntitySpawner {

    private double sceneHight;

    private double sceneWidth;

    private int gameGap;

    private int gameSpeed;

    public PowerSpawner(double sceneHight, double sceneWidth, int interval, int gameSpeed, int gameGap) {
        super(interval);
    }

    @Override
    protected void spawnEntities() {

    }
}
