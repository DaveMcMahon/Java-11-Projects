package gui.window;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import gui.objects.MyLine;
import gui.objects.MyOval;
import gui.objects.MyRectangle;
import gui.objects.MyShape;
import interfaces.IDrawable;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Random random;
	private IDrawable[] shapes;
	private int lineCount = 0;
	private int rectangleCount = 0;
	private int ovalCount = 0;

	public MainPanel() {

		this.setBackground(Color.white);
		random = new Random();

		String numOfShapesAsString = JOptionPane.showInputDialog("Enter in number of shapes: ");
		int numOfShapesAsInt = Integer.parseInt(numOfShapesAsString);

		if (numOfShapesAsInt >= 1)
			shapes = new MyShape[numOfShapesAsInt];
		else
			shapes = new MyShape[0];

		for (int count = 0; count < shapes.length; count++) {
			int x1 = random.nextInt(300);
			int y1 = random.nextInt(300);
			int x2 = random.nextInt(300);
			int y2 = random.nextInt(300);

			Color myColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
			int shapeType = random.nextInt(3);

			if (shapeType != 0) {
				int filled = random.nextInt(2);
				boolean isFilled = filled == 0 ? true : false;

				if (shapeType == 1) {
					shapes[count] = new MyRectangle(x1, y1, x2, y2, myColor, isFilled);
					rectangleCount++;
				} else {
					shapes[count] = new MyOval(x1, y1, x2, y2, myColor, isFilled);
					ovalCount++;
				}
			} else {
				shapes[count] = new MyLine(x1, y1, x2, y2, myColor);
				lineCount++;
			}
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (IDrawable shape : shapes) {
			shape.draw(g);
		}
	}

	public String getStatusText() {
		return "Lines: " + lineCount + ", Rectangles: " + rectangleCount + ", Ovals: " + ovalCount;
	}
}
