package gui.objects;

import java.awt.Color;

import interfaces.IDrawable;

public abstract class MyShape implements IDrawable {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color myColor;

	public MyShape(int x1, int y1, int x2, int y2, Color myColor) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.myColor = myColor;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return this.x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return this.y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public void setColor(Color myColor) {
		this.myColor = myColor;
	}

	public Color getColor() {
		return this.myColor;
	}

}
