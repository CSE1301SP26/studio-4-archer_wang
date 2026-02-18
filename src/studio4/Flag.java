package studio4;

import java.awt.Color;

import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 1, 1);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.35);
		double[] xCoords = {0.5, 0.5, 0.85, 0.15};
		double[] yCoords = {0.85, 0.15, 0.5, 0.5};
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledPolygon(xCoords, yCoords);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.325, 0.325, 0.1625);
		StdDraw.filledCircle(0.675, 0.675, 0.1625);
		StdDraw.setPenColor(Color.YELLOW);
		Font font = new Font("Unageo", Font.BOLD, 80);
		StdDraw.setFont(font);
		StdDraw.setPenRadius(0.25);
		StdDraw.text(0.325, 0.325, "π");
		StdDraw.text(0.675, 0.675, "π");

	}
}