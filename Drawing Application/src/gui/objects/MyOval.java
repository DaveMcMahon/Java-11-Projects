package gui.objects;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape {

	public MyOval(int x1, int y1, int x2, int y2, Color myColor, boolean isFilled) {
		super(x1, y1, x2, y2, myColor, isFilled);
	}

	public MyOval() {
		super(0, 0, 0, 0, Color.black, false);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());

		if (!getFilled())
			g.drawOval(this.getUpperLeftX(), this.getUpperLeftY(), this.getWidth(), this.getHeight());
		else
			g.fillOval(this.getUpperLeftX(), this.getUpperLeftY(), this.getWidth(), this.getHeight());
	}
}
