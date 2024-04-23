package org.Game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import org.Game.Scenes.GameScene;

public class testHitBoxes extends YaegerGame {

	public static void main(String[] args) {
		String[] arguments = new String[args.length + 1];
		arguments[0] = "--noSplash";
		for (int i = 0; i < args.length; i++) {
			arguments[i + 1] = args[i];
		}
		launch(arguments);
	}

	public void setupGame() {
		setGameTitle("testHitBoxes");
		setSize(new Size(900));
	}

	public void setupScenes() {
		addScene(0, new GameScene());
	}
}
