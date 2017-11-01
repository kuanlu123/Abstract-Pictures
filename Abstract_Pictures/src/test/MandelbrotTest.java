package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Main;
import model.Mandelbrot;

public class MandelbrotTest {
	// // Translate a pixel's row to the associated x-coordinate in the fractal
	@Test
	public void testRowsMandelbrot() {
		Mandelbrot mb = new Mandelbrot();
		assertEquals(-2.15, mb.xCalculate(0), .001);
		assertEquals(-.8072, mb.xCalculate(250 * 4), .001);
		assertEquals(0.6, mb.xCalculate(512 * 4), .001);
	}

	// Translate a pixel's column to the associated y-coordinate in the fractal
	@Test
	public void testCollMandelbrot() {
		Mandelbrot mb = new Mandelbrot();
		assertEquals(-1.3, mb.yCalculate(0), .001);
		assertEquals(-.0304, mb.yCalculate(250 * 4), .001);
		assertEquals(1.3, mb.yCalculate(512 * 4), .001);
	}

	// Calculates the escape time for a coordinate whose distance from the
	// origin exceeds the escape distance after a single loop pass (updated)
	@Test
	public void testEscapeTimeExceedMandelbrot() {
		Main main = new Mandelbrot();
		main.distanceVal = 2;
		assertEquals(1, main.CalculatePixel(0.5946289062500001, 1.2949218750000122));
	}

	// Calculates the escape time for a coordinate whose distance from the
	// origin never exceeds the escape distance (updated)
	@Test
	public void testEscapeTimeDoesntExceedMandelbrot() {
		Main main = new Mandelbrot();
		main.distanceVal = 2;
		main.passesVal = 255;
		assertEquals(255, main.CalculatePixel(0.3207031250000001, -0.07109374999999386));

	}

	// Checks if grid is correctly made.
	@Test
	public void testGridMake() {
		Mandelbrot gm = new Mandelbrot();
		assertEquals(512 * 4, gm.gridMake().length);
		assertEquals(512 * 4, gm.gridMake()[0].length);
	}

	// This tests when the escape distance is set to 3 and calculates the escape
	// time for a coordinate whose distance from the
	// origin exceeds the escape distance after a 10 passes of the loop.
	@Test
	public void testEscapeTimeDistance3Mandelbrot() {
		Main main = new Mandelbrot();
		main.distanceVal = 3;
		assertEquals(10, main.CalculatePixel(0.46007827788650374, -0.3383561643835661));
	}

	// This test just checks that when the escape distance is 2 the calculate
	// pixel wont exceed the maximum escape distance 135.
	@Test
	public void testMaxEscapeDistance135Mandelbrot() {
		Main main = new Mandelbrot();
		main.distanceVal = 2;
		main.passesVal = 135;
		assertEquals(135, main.CalculatePixel(0.3207031250000001, -0.07109374999999386));
	}
}
