package org.Game.Entities.Powerups;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import org.Game.Entities.Power;
import org.Game.Scenes.GameScene;

import java.util.List;

public class PowerSpeed extends Power {

    public PowerSpeed(Coordinate2D location, GameScene gameScene) {
        super(location, gameScene.getGameSpeed(), gameScene, "sprites/speedPowerDown.png");
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        gameScene.setSpeed(gameScene.getGameSpeed() + 2);
        //todo : remove from powers list
        //todo : start timer???
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        //todo : remove from powers list
    }
}
