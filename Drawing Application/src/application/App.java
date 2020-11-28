package application;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import gui.window.MainPanel;

public class App {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		MainPanel panel = new MainPanel();

		String statusText = panel.getStatusText();
		JLabel statusLabel = new JLabel(statusText);

		myFrame.add(panel);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(statusLabel, BorderLayout.SOUTH);
		myFrame.setSize(300, 300);

		myFrame.setVisible(true);
	}

}
