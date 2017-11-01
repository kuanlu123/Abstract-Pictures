package model;

import uerInterface.UI;

// This is a class that stores the method that makes this program runnable
public class Driver {
	// This is the method that makes this program runnable. I chose new
	// Mandelbrot just to put something into the parameter but
	// it could've been any fractal to make this program run.
	public static void main(String[] args) {
		new UI(new BurningShip());
	}
}
