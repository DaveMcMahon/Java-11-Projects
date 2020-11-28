package gui.objects;

import java.awt.Color;

public abstract class MyBoundedShape extends MyShape {

	private boolean isFilled;

	public MyBoundedShape(int x1, int y1, int x2, int y2, Color myColor, boolean isFilled) {
		super(x1, y1, x2, y2, myColor);
		this.isFilled = isFilled;
	}

	public MyBoundedShape() {
		super(0, 0, 0, 0, Color.black);
		this.isFilled = false;
	}

	public int getUpperLeftX() {
		return Math.min(this.getX1(), this.getX2());
	}

	public int getUpperLeftY() {
		return Math.min(this.getY1(), this.getY2());
	}

	public int getWidth() {
		return Math.abs(this.getX2() - this.getX1());
	}

	public int getHeight() {
		return Math.abs(this.getY2() - this.getY1());
	}

	public boolean getFilled() {
		return this.isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

}
