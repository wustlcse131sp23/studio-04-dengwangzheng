package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color puply= new Color (215,205,212);
		Color boba=new Color(40, 29, 29);
		StdDraw.setPenColor(puply);
		StdDraw.filledRectangle(0.5,0.5,0.5,0.4);
		StdDraw.setPenColor(boba);
		Color straw=new Color(233,255,206);
		StdDraw.filledCircle(0.15,0.2,0.05);
		StdDraw.filledCircle(0.3,0.2,0.05);
		StdDraw.filledCircle(0.45,0.2,0.05);
		StdDraw.filledCircle(0.6,0.2,0.05);
		StdDraw.filledCircle(0.75,0.2,0.05);
		StdDraw.filledCircle(0.9,0.2,0.05);
		StdDraw.setPenColor(straw);
		StdDraw.filledRectangle(0.4, 0.6, 0.05, 0.3);
	}
}