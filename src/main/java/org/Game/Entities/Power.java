package com.github.hanyaeger.tutorial.Game.Entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.Game.Scenes.GameScene;

import java.util.List;

public abstract class Power extends DynamicSpriteEntity implements Collided, SceneBorderCrossingWatcher {

	protected int hight;

	protected int width;

	protected GameScene gameScene;

    public Power(Coordinate2D location, int gameSpeed, GameScene gameScene, String filename) {
        super(filename, location);
    }
}
