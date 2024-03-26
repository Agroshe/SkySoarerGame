package org.Game.Scenes;


import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import org.Game.Entities.Buttons.ButtonExit;
import org.Game.Entities.Buttons.ButtonGap;
import org.Game.Entities.Buttons.ButtonSpeed;
import org.Game.Entities.Buttons.ButtonStartGame;
import org.Game.SkySourerGame;

public class StartScene extends StaticScene {

    private SkySourerGame skySourerGame;
    private GameScene gameScene;

    public StartScene(SkySourerGame skySourerGame, GameScene gameScene) {
        this.skySourerGame = skySourerGame;
        this.gameScene = gameScene;
    }

    public void setupScene() {

    }

    public void setupEntities() {

        var exitButton = new ButtonExit(
                35, 35, new Coordinate2D(getWidth() - (double) 35 / 2, (double) 35 / 2), skySourerGame
        );
        var textGameNaam = new TextEntity(
                new Coordinate2D(getWidth() / 2, 5), "Sky Sourer");
        var textSpeed = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2 - 150), "Snelheid");
        var buttonSpeedSlow = new ButtonSpeed(
                100, 60, new Coordinate2D(getWidth() / 2 - 100, getHeight() / 2 - 100), "Langzaam", this, (getHeight() * 0.003)
        );
        var buttonSpeedAverage = new ButtonSpeed(
                100, 60, new Coordinate2D(getWidth() / 2, getHeight() / 2 - 100), "Gemiddeld", this, (getHeight() * 0.004)
        );
        var buttonSpeedFast = new ButtonSpeed(
                100, 60, new Coordinate2D(getWidth() / 2 + 100, getHeight() / 2 - 100), "Snel", this, (getHeight() * 0.005)
        );

        var textGap = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2 + 50), "Gap groote");

        var buttonGapBig = new ButtonGap(
                100, 60, new Coordinate2D(getWidth() / 2 - 100, getHeight() / 2 + 100), "Groot", (int) (getHeight() * 0.4), this
        );
        var buttonGapAverage = new ButtonGap(
                100, 60, new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100), "Gemiddeld", (int) (getHeight() * 0.3), this
        );
        var buttonGapSmall = new ButtonGap(
                100, 60, new Coordinate2D(getWidth() / 2 + 100, getHeight() / 2 + 100), "Klein", (int) (getHeight() * 0.2), this
        );

        var buttonStartGame = new ButtonStartGame(
                100, 60, new Coordinate2D(getWidth() / 2, getHeight() / 2 + 225), skySourerGame
        );

        textGap.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        textSpeed.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        textGameNaam.setAnchorPoint(AnchorPoint.CENTER_CENTER);

        addEntity(exitButton);
        addEntity(textGameNaam);
        addEntity(textSpeed);
        addEntity(buttonSpeedSlow);
        addEntity(buttonSpeedAverage);
        addEntity(buttonSpeedFast);
        addEntity(textGap);
        addEntity(buttonGapBig);
        addEntity(buttonGapAverage);
        addEntity(buttonGapSmall);
        addEntity(buttonStartGame);
    }

    public void setSpeed(double speed) {
        gameScene.setSpeed(speed);
    }

    public void setGap(int gap) {
        gameScene.setGap(gap);
    }
}
