package org.Game;

import com.github.hanyaeger.api.Timer;
import org.Game.Entities.Power;

public class PowerTimer extends Timer {

	private Power power;

	protected PowerTimer(long intervalInMs) {
		super(intervalInMs);
	}

	public void onAnimationUpdate(long timeStamp) {

	}

}
