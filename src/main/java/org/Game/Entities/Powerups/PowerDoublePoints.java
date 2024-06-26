package org.Game.Entities.Powerups;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import org.Game.Entities.Power;
import org.Game.Scenes.GameScene;

import java.util.List;

public class PowerDoublePoints extends Power {

    public PowerDoublePoints(Coordinate2D location, GameScene gameScene) {
        super(location, gameScene.getGameSpeed(), gameScene, "sprites/doublePointsPowerup.png");
    }


    @Override
    public void onCollision(List<Collider> collidingObjects) {
        gameScene.setScoreMultiplier(2);
        gameScene.startPowerTimer(this);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        if (border == SceneBorder.LEFT) {
            this.remove();
        }
    }
}
