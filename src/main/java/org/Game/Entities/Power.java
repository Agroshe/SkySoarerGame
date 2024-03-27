package org.Game.Entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import org.Game.Scenes.GameScene;

public abstract class Power extends DynamicSpriteEntity implements Collided, SceneBorderCrossingWatcher {

    protected int hight;

    protected int width;

    protected GameScene gameScene;

    public Power(Coordinate2D location, double gameSpeed, GameScene gameScene, String filename) {
        super(filename, location, new Size(gameScene.getHeight() * 0.083));
        this.gameScene = gameScene;
        setMotion(gameSpeed, 270d);
    }
}
