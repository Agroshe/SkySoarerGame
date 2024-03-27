package org.Game;

import com.github.hanyaeger.api.Timer;
import org.Game.Entities.Power;
import org.Game.Entities.Powerups.PowerDoublePoints;
import org.Game.Entities.Powerups.PowerSpeed;
import org.Game.Entities.Powerups.PowerTransparancy;
import org.Game.Scenes.GameScene;

public class PowerTimer extends Timer {

    private String power;
    private GameScene gameScene;
    private double gameSpeed;

    public PowerTimer(String power, GameScene gameScene) {
        super(10000);
        this.power = power;
        this.gameScene = gameScene;
        gameSpeed = gameScene.getGameSpeed();
    }

    public void onAnimationUpdate(long timeStamp) {
        if (power.equals("powerDoublePoints")) {
            gameScene.setScoreMultiplier(1);
            this.reset();
            this.pause();
        }
        if (power.equals("powerTransparancy")) {
            gameScene.setCollision(true);
            this.reset();
            this.pause();
        }
        if (power.equals("powerSpeed")) {
            gameScene.setSpeed(gameSpeed);
            this.reset();
            this.pause();
        }
//        if(power instanceof PowerDoublePoints){
//            gameScene.setScoreMultiplier(1);
//            this.remove();
//        }
    }

}
