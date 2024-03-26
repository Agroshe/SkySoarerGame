package org.Game.Entities;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;


public class ScoreText extends TextEntity {

	private int score;

	public ScoreText(Coordinate2D location) {
        super(location);
		setAnchorPoint(AnchorPoint.TOP_CENTER);
    }

	public void setScoreText(int score) {

	}

}
