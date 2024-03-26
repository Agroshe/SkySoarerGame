package org.Game.Entities;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;


public class ScoreText extends TextEntity {

	public ScoreText(Coordinate2D location) {
        super(location);
		setAnchorPoint(AnchorPoint.TOP_CENTER);
		setScoreText(0);
    }

	public void setScoreText(int score) {
		setText("Score: " + score);
	}

}
