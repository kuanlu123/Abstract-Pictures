package model;

//Made this Mandelbrot class extend the Main class.

public class Mandelbrot extends Main {

	// Made all these static variables which store the specific values of
	// Mandelbrot set.
	static double minX = -2.15;
	static double maxX = 0.6;
	static double minY = -1.3;
	static double maxY = 1.3;

	// This is the constructor for Mandelbrot. The super call stores these
	// values into the Main's parameter so that it can use these
	// specific values.

	public Mandelbrot() {
		super(minX, maxX, minY, maxY);
	}

}