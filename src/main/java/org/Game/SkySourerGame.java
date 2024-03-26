package org.Game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import org.Game.Scenes.DeathScene;
import org.Game.Scenes.GameScene;
import org.Game.Scenes.StartScene;

import java.io.InputStream;
import java.util.Scanner;

public class SkySourerGame extends YaegerGame {

	private int Highscore;
	private StartScene startScene;
	private GameScene gameScene;

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
		setSize(new Size(700));
	}

	public void setupScenes() {
		gameScene = new GameScene(this);
		startScene = new StartScene(this, gameScene);

		addScene(0, startScene);
		addScene(1, gameScene);
		addScene(2, new DeathScene(this));

	}

	public void handleDeath(int score) {

	}

	public void startGame(int speed, int gap) {

	}

	public void getHighscoreFromFile() {
		InputStream inputStream = SkySourerGame.class.getResourceAsStream("/highScore.txt");
		if (inputStream != null) {
			try (Scanner scanner = new Scanner(inputStream)) {
				// Het lezen van de enkele regel van het bestand
				String highScoreText = scanner.nextLine();
				System.out.println("Inhoud van highScore.txt:");
				System.out.println(highScoreText);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void setHighscoreInFile() {

	}

	public int getHighscore() {
		return 0;
	}

	public int getScore() {
		return 0;
	}

}
