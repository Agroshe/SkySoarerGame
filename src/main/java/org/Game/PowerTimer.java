package org.Game;

import com.github.hanyaeger.api.Timer;
import org.Game.Entities.Power;
import org.Game.Entities.Powerups.PowerDoublePoints;
import org.Game.Entities.Powerups.PowerSpeed;
import org.Game.Entities.Powerups.PowerTransparancy;
import org.Game.Scenes.GameScene;

public class PowerTimer extends Timer {

    private Power power;
    private GameScene gameScene;
    private double gameSpeed;

    public PowerTimer(Power power, GameScene gameScene) {
        super(30000);
        this.power = power;
        this.gameScene = gameScene;
        gameSpeed = gameScene.getGameSpeed();
    }

    public void onAnimationUpdate(long timeStamp) {
        if(power instanceof PowerDoublePoints){
            gameScene.setScoreMultiplier(1);
            this.remove();
        }
        if(power instanceof PowerTransparancy) {
            gameScene.setCollision(true);
            this.remove();
        }
        if(power instanceof PowerSpeed){
            gameScene.setSpeed(gameSpeed);
            this.remove();
        }
//        if(power instanceof PowerDoublePoints){
//            gameScene.setScoreMultiplier(1);
//            this.remove();
//        }
    }

}
