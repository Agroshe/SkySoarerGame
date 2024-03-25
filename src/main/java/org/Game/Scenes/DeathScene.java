package org.Game.Scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import org.Game.SkySourerGame;

public class DeathScene extends StaticScene {

	private SkySourerGame skySourerGame;

	public DeathScene(SkySourerGame skySourerGame) {
	}

	public void setupScene() {

	}

	public void setupEntities() {
		var textScore = new TextEntity(
				new Coordinate2D(getWidth() /2 , getHeight()), "Score");

	}

}
