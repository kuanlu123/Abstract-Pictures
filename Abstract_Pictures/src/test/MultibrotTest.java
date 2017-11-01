package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Main;
import model.Multibrot;

public class MultibrotTest {
	/*
	 * Data provided on the website
	 * http://www.cse.buffalo.edu/~mhertz/courses/cse116/Projects/project01.html
	 * The data is under Escape time algorithms and grading rubric.
	 */
	// // Translate a pixel's row to the associated x-coordinate in the fractal
	@Test
	public void testRowsMultiBrot() {
		Multibrot mt = new Multibrot();
		assertEquals(-1, mt.xCalculate(0), .001);
		assertEquals(-0.0234375, mt.xCalculate(250 * 4), .001);
		assertEquals(1, mt.xCalculate(512 * 4), .001);
	}

	// Translate a pixel's column to the associated y-coordinate in the fractal
	@Test
	public void testCollMultiBrot() {
		Multibrot mt = new Multibrot();
		assertEquals(-1.3, mt.yCalculate(0), .001);
		assertEquals(-.0304, mt.yCalculate(250 * 4), .001);
		assertEquals(1.3, mt.yCalculate(512 * 4), .001);
	}
	// Calculates the escape time for a coordinate whose distance from the
	// origin exceeds the escape distance after a single loop pass (updated)

	@Test
	public void testEscapeTimeExceedMultiBrot() {
		Main main = new Multibrot();
		main.distanceVal = 2;
		assertEquals(1, main.CalculatePixel(0.9921875, 1.05625));

	}

	// Calculates the escape time for a coordinate whose distance from the
	// origin never exceeds the escape distance (updated)
	@Test
	public void testEscapeTimeMaxDoesntExceedMultiBrot() {
		Main main = new Multibrot();
		main.distanceVal = 2;
		main.passesVal = 255;
		assertEquals(255, main.CalculatePixel(0.5859375, 0.24375000000000108));

	}

	// Checks if grid is correctly made.
	@Test
	public void testGridMake() {
		Multibrot mt = new Multibrot();
		assertEquals(512 * 4, mt.gridMake().length);
		assertEquals(512 * 4, mt.gridMake()[0].length);
	}

	// This tests when the escape distance is set to 3 and calculates the escape
	// time for a coordinate whose distance from the
	// origin exceeds the escape distance after a 10 passes of the loop.
	@Test
	public void testEscapeTimeDistance3Multibrot() {

		Main main = new Multibrot();
		main.distanceVal = 3;
		assertEquals(10, main.CalculatePixel(0.7025440313111545, -0.5520547945205528));
	}

	// This test just checks that when the escape distance is 2 the calculate
	// pixel wont exceed the maximum escape distance 135.
	@Test
	public void testMaxEscapeDistance135Multibrot() {
		Main main = new Multibrot();
		main.distanceVal = 2;
		main.passesVal = 135;
		assertEquals(135, main.CalculatePixel(0.5859375, 0.24375000000000108));
	}
}
