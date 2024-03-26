package org.Game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import org.Game.Scenes.DeathScene;
import org.Game.Scenes.GameScene;
import org.Game.Scenes.StartScene;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SkySourerGame extends YaegerGame {

    private int Highscore;
    private StartScene startScene;
    private GameScene gameScene;
    private final Size size = new Size(1000, 600);


    public static void main(String[] args) {
        String[] arguments = new String[args.length + 1];
        arguments[0] = "--noSplash";
        for (int i = 0; i < args.length; i++) {
            arguments[i + 1] = args[i];
        }
        launch(arguments);

    }

    public void setupGame() {
        setGameTitle("SkySourer");
        setSize(size);
        getHighscoreFromFile();

    }

    public void setupScenes() {
        gameScene = new GameScene(this);
        startScene = new StartScene(this, gameScene);

        addScene(0, startScene);
        addScene(1, gameScene);
        addScene(2, new DeathScene(this));

    }

    public void handleDeath(int score) {
        if (score > Highscore) {
            Highscore = score;
            setHighscoreInFile();
        }
        setActiveScene(2);
    }

    public void getHighscoreFromFile() {
        InputStream inputStream = SkySourerGame.class.getResourceAsStream("/highScore/highScore.txt");
        if (inputStream != null) {
            try (Scanner scanner = new Scanner(inputStream)) {
                // Het lezen van de enkele regel van het bestand
                String highScoreText = scanner.nextLine();
                Highscore = Integer.parseInt(highScoreText);
                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setHighscoreInFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/highScore/highScore.txt"))) {
            writer.write(String.valueOf(Highscore));
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing high score to file:");
            e.printStackTrace();
        }
    }

    public int getHighscore() {
        return Highscore;
    }

    public int getScore() {
        return gameScene.getScore();
    }

}
