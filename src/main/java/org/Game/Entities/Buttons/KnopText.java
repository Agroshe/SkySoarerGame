package org.Game.Entities.Buttons;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;

public class KnopText extends TextEntity {

	public KnopText(int x, int y, String text) {
        super(new Coordinate2D(x, y), text);

    }

}
