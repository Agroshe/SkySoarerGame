package com.github.hanyaeger.tutorial.Game.Entities.Buttons;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.CompositeEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.Game.SkySourerGame;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Text;


public abstract class Button extends CompositeEntity implements MouseEnterListener, MouseExitListener, MouseButtonPressedListener {

	private SkySourerGame skySourerGame;

	private String text;
	private int width;
	private int height;
	private KnopBox knopBox;

	private KnopText knopText;

	public Button(int width, int height, Coordinate2D location, String text) {
        super(location);//idk
		this.width = width;
		this.height = height;
		this.text = text;

    }


	public abstract void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D);

	public void onMouseEntered() {

	}

	public void onMouseExited() {

	}

    protected void setupEntities() {
		var knopBox = new KnopBox(
				width,height,new Coordinate2D(0,0)
		);
		var knopText = new KnopText(
				text
		);
    }

}
