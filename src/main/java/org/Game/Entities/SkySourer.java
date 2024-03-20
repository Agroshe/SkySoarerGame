package com.github.hanyaeger.tutorial.Game.Entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.Game.SkySourerGame;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class SkySourer extends DynamicSpriteEntity implements SceneBorderTouchingWatcher, Newtonian, Collided, Collider, Rotatable {

	private int score;

	private boolean collision;

	private int scoreMulitplier;

	private int gameSpeed;

	private SkySourerGame skySourerGame;

	public SkySourer(Coordinate2D location, ScoreText scoreText, SkySourerGame skySourerGame) {
        super("sprites/FlappyBird.png", location);

    }


	public void onCollision(List<Collider> collidingObjects) {

	}

	public void onPressedKeysChange(Set<KeyCode> pressedKeys) {

	}

	public int getScore() {
		return 0;
	}

	public void setCollision(boolean collision) {

	}

	public void setScoreMulitplier(int multiplier) {

	}

	public void setSpeed(int gameSpeed) {

	}

	@Override
	public void notifyBoundaryTouching(SceneBorder border) {

	}
}
