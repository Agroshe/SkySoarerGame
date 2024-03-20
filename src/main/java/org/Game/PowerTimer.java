package com.github.hanyaeger.tutorial.Game;

import com.github.hanyaeger.api.Timer;
import com.github.hanyaeger.tutorial.Game.Entities.Power;

public class PowerTimer extends Timer {

	private Power power;

	protected PowerTimer(long intervalInMs) {
		super(intervalInMs);
	}

	public void onAnimationUpdate(long timeStamp) {

	}

}
