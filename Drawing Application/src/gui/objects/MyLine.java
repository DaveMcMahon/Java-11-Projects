package gui.objects;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape {

	public MyLine(int x1, int y1, int x2, int y2, Color myColor) {
		super(x1, y1, x2, y2, myColor);
	}

	public MyLine() {
		super(0, 0, 0, 0, Color.black);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.drawLine(this.getX1(), this.getY1(), this.getX2(), this.getY2());
	}

}
