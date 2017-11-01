package model;

import java.awt.Point;

import javax.swing.SwingWorker;

// I have made Main the abstract class which means this is the super class. I did this so I can have all the classes called in
// this class at once rather than spread them all out as separate classes. This will also make creating the UI easier.

public abstract class Main {
	// These are all the instance variables. Made distanceVal a variable because
	// we need to be able to change the escape time and
	// passesVal a variable just to make life easier in case we need to change
	// in for future phases.
	// Made the doubles minX,maxX,minY,maxY etc because I needed to store the
	// pass in values for the sub classes somewhere.
	// distanceVal is also changed to static because we need a way to preserve
	// its value while changing the images.
	// This basically makes it so that when we change the escape distance during
	// the fractal changes it will still keep the current
	// changed escapeDistance and wont reset it while changing Images.
	public static double distanceVal = 2;
	public static int passesVal = 255;
	public double minX;
	public double maxX;
	public double minY;
	public double maxY;
	public double rangeX;
	public double rangeY;
	public double minX1 = -2.15;
	public double minX2 = -1.7;
	public double minX3 = -1.8;
	public double minX4 = -1.0;
	public int gridx = 2048;
	public int center = gridx / 2;

	// This is the constructor of the main and it takes in these paramters so
	// that we can call in the values from the sub classes
	// like Mandelbrot, BurningShip etc.. I also use this to store in the values
	// from the subclasses to the instance variables
	// declared in Main.
	public Main(double MINX, double MAXX, double MINY, double MAXY) {
		minX = MINX;
		maxX = MAXX;
		minY = MINY;
		maxY = MAXY;
		rangeX = MAXX - MINX;
		rangeY = MAXY - MINY;
	}

	// This just creates the grid 512 by 512. I used two for loops and a 2d
	// Array to create this.
	public int[][] gridMake() {
		int[][] grid = new int[gridx][gridx];
		for (int rows = 0; rows < gridx; rows++) {
			for (int coll = 0; coll < gridx; coll++) {
				grid[rows][coll] = CalculatePixel(xCalculate(rows), yCalculate(coll));
			}

		}
		return grid;
	}

	// This method will calculate the Pixel for all the different sets. The
	// different if statements I made were used to
	// differentiate between when we call which method. The minX is unique to
	// the separate classes that we need to call
	// like Mandelbrot, BurningShip etc.. Also in the if statement I called the
	// specific method related to the minX that is unique
	// to each set.
	// The formulas is on Matthew Hertz phase 1 site if you need to check how I
	// got these.
	public int CalculatePixel(double xCalc, double yCalc) {

		double distance = Math.sqrt(xCalc * xCalc + yCalc * yCalc);
		int passes = 0;
		double CurrentXCalc = xCalc;
		double CurrentYCalc = yCalc;
		if (minX == minX1) {
			while (distance <= distanceVal && passes < passesVal) {
				double xPrime = MandelbrotFormulaX(xCalc, yCalc, CurrentXCalc);
				double yPrime = MandelbrotFormulaY(xCalc, yCalc, CurrentYCalc);

				passes++;
				distance = Math.sqrt((xPrime * xPrime) + (yPrime * yPrime));
				xCalc = xPrime;
				yCalc = yPrime;
			}
		}
		if (minX == minX2) {
			while (distance <= distanceVal && passes < passesVal) {
				double xPrime = JuliaFormulaX(xCalc, yCalc, CurrentXCalc);
				double yPrime = JuliaFormulaY(xCalc, yCalc, CurrentYCalc);

				passes++;
				distance = Math.sqrt((xPrime * xPrime) + (yPrime * yPrime));
				xCalc = xPrime;
				yCalc = yPrime;
			}
		}
		if (minX == minX3) {
			while (distance <= distanceVal && passes < passesVal) {
				double xPrime = BurningShipFormulaX(xCalc, yCalc, CurrentXCalc);
				double yPrime = BurningShipFormulaY(xCalc, yCalc, CurrentYCalc);
				passes++;
				distance = Math.sqrt((xPrime * xPrime) + (yPrime * yPrime));
				xCalc = xPrime;
				yCalc = yPrime;
			}
		}
		if (minX == minX4) {
			while (distance <= distanceVal && passes < passesVal) {
				double xPrime = MultibrotFormulaX(xCalc, yCalc, CurrentXCalc);
				double yPrime = MultibrotFormulaY(xCalc, yCalc, CurrentYCalc);
				passes++;
				distance = Math.sqrt((xPrime * xPrime) + (yPrime * yPrime));
				xCalc = xPrime;
				yCalc = yPrime;
			}
		}
		return passes;
	}
	// These are the formulas for each different fractal. These formulas are
	// unique to each and set and are called upon in the if
	// statements in the CalculatePixel method. Formulas are on Matthew Hertz
	// phase 1 site.

	// Mandelbrot Formulas
	public double MandelbrotFormulaX(double xCalc, double yCalc, double CurrentXCalc) {
		return (xCalc * xCalc) - (yCalc * yCalc) + CurrentXCalc;
	}

	public double MandelbrotFormulaY(double xCalc, double yCalc, double CurrentYCalc) {
		return (2 * xCalc * yCalc) + CurrentYCalc;
	}

	// Julia Formulas
	public double JuliaFormulaX(double xCalc, double yCalc, double CurrentXCalc) {
		return (xCalc * xCalc) - (yCalc * yCalc) + -0.72689;
	}

	public double JuliaFormulaY(double xCalc, double yCalc, double CurrentYCalc) {
		return (2 * xCalc * yCalc + 0.188887);
	}

	// Multibrot Formulas
	public double MultibrotFormulaX(double xCalc, double yCalc, double CurrentXCalc) {
		return (xCalc * xCalc * xCalc) - (3 * xCalc * yCalc * yCalc) + CurrentXCalc;
	}

	public double MultibrotFormulaY(double xCalc, double yCalc, double CurrentYCalc) {
		return (3 * xCalc * xCalc * yCalc) - (yCalc * yCalc * yCalc) + CurrentYCalc;
	}

	// BurningShip Formulas
	public double BurningShipFormulaX(double xCalc, double yCalc, double CurrentXCalc) {
		return (xCalc * xCalc) - (yCalc * yCalc) + CurrentXCalc;
	}

	public double BurningShipFormulaY(double xCalc, double yCalc, double CurrentYCalc) {
		return Math.abs((2 * xCalc * yCalc)) + CurrentYCalc;
	}

	// This formulas basically calculates the current x coordinate for each
	// Pixel. We do minX because we need to know where to start
	// and then we add on range * ((double)x/512) to check each specific pixel
	// out of the 512 grid.
	public double xCalculate(double x) {
		double xCalc = minX + rangeX * ((double) x / gridx);

		return xCalc;
	}

	// This formulas basically calculates the current y coordinate for each
	// Pixel. We do minX because we need to know where to start
	// and then we add on range * ((double)x/512) to check each specific pixel
	// out of the 512 grid.
	public double yCalculate(double y) {

		double yCalc = minY + rangeY * ((double) y / gridx);
		return yCalc;

	}

}