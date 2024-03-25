package org.Game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import org.Game.Scenes.DeathScene;
import org.Game.Scenes.GameScene;
import org.Game.Scenes.StartScene;

public class SkySourerGame extends YaegerGame {

	private int Highscore;

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
		setSize(new Size(900));
	}

	public void setupScenes() {
		addScene(0, new GameScene(this, 2, 100));
		addScene(1, new StartScene(this, 5, 150));
		addScene(2, new DeathScene(this));
	}

	public void HandleDeath(int score) {

	}

	public void startGame(int speed, int gap) {

	}

	public void getHighscoreFromFile() {

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
