package com.github.hanyaeger.tutorial.Game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.Game.Scenes.DeathScene;
import com.github.hanyaeger.tutorial.Game.Scenes.GameScene;
import com.github.hanyaeger.tutorial.Game.Scenes.StartScene;

public class SkySourerGame extends YaegerGame {

	private int Highscore;

	public static void main(String[] args) {
//		String[] arguments = new String[args.length + 1];
//		arguments[0] = "--noSplash";
//		for (int i = 0; i < args.length; i++) {
//			arguments[i + 1] = args[i];
//		}
//		launch(arguments);
		launch(args);
	}

	public void setupGame() {
		setGameTitle("SkySourer");
		setSize(new Size(900));
	}

	public void setupScenes() {
		addScene(0, new StartScene(this, 50, 150));
		addScene(1, new GameScene(this, 50, 150));
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
