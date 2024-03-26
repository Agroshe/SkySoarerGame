package org.Game.Entities.Buttons;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.CompositeEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.paint.Color;
import org.Game.SkySourerGame;
import javafx.scene.input.MouseButton;


public abstract class Button extends CompositeEntity implements MouseEnterListener, MouseExitListener, MouseButtonPressedListener {

	private SkySourerGame skySourerGame;

	private String text;
	private int width;
	private int height;
	private KnopBox knopBox;

	private KnopText knopText;


	public Button(int width, int height, Coordinate2D location, String text) {
        super(location);
		this.width = width;
		this.height = height;
		this.text = text;


    }


	public abstract void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D);



    protected void setupEntities() {
		knopBox = new KnopBox(
				width,height,new Coordinate2D(0,0)
		);
		knopText = new KnopText(
				width, height, text
		);
		knopBox.setFill(Color.WHITE);
		knopBox.setStrokeColor(Color.BLACK);
		knopText.setAnchorLocation(new Coordinate2D(0,0));
		knopBox.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		knopText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		addEntity(knopBox);
		addEntity(knopText);

    }

	public void onMouseEntered() {
		knopBox.setFill(Color.GRAY);
		setCursor(Cursor.HAND);
	}

	public void onMouseExited() {
		knopBox.setFill(Color.WHITE);
		setCursor(Cursor.DEFAULT);
	}

}
