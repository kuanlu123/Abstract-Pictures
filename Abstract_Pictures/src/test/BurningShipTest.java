package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.BurningShip;
import model.Main;

public class BurningShipTest {
	// Translate a pixel's row to the associated x-coordinate in the fractal
	@Test
	public void testRowsBurningShip() {
		BurningShip bs = new BurningShip();
		assertEquals(-1.8, bs.xCalculate(0), .001);
		assertEquals(-1.751, bs.xCalculate(250 * 4), .001);
		assertEquals(-1.7, bs.xCalculate(512 * 4), .001);

	}

	// Translate a pixel's column to the associated y-coordinate in the fractal
	@Test
	public void testCollBurningShip() {
		BurningShip bs = new BurningShip();
		assertEquals(-0.08, bs.yCalculate(0), .001);
		assertEquals(-0.0287, bs.yCalculate(250 * 4), .001);
		assertEquals(0.025, bs.yCalculate(512 * 4), .001);
	}

	@Test
	public void testEscapeTimeDoesntExceedBurningShip() {
		Main main = new BurningShip();
		main.distanceVal = 2;
		main.passesVal = 255;
		assertEquals(255, main.CalculatePixel(-1.7443359374999874, -0.017451171875000338));
	}

	// Test escape time for burning ship doesn't have 0 or 1 as escape time by
	// making two for loops to check the whole grid.
	@Test
	public void testEscapeTimeDoesntHave0and1BurningShip() {
		Main main = new BurningShip();
		main.distanceVal = 2;
		for (int row = 0; row < 512; row++) {
			for (int col = 0; col < 512; col++) {
				assertNotEquals(0, main.CalculatePixel(main.xCalculate(row), main.yCalculate(col)));
				assertNotEquals(1, main.CalculatePixel(main.xCalculate(row), main.yCalculate(col)));

			}
		}
	}

	// Test if the grid is correctlyS made with 512 rows and 512 columns
	@Test
	public void testGridMake() {
		BurningShip gm = new BurningShip();
		assertEquals(512 * 4, gm.gridMake().length);
		assertEquals(512 * 4, gm.gridMake()[0].length);
	}

	// This tests when the escape distance is set to 3 and calculates the escape
	// time for a coordinate whose distance from the
	// origin exceeds the escape distance after a 10 passes of the loop.
	@Test
	public void testEscapeTimeDistance3BurningShip() {

		Main main = new BurningShip();
		main.distanceVal = 3;
		assertEquals(10, main.CalculatePixel(-1.6999999999999802, 0.0030136986301371603));
	}

	// This test just checks that when the escape distance is 2 the calculate
	// pixel wont exceed the maximum escape distance 135.
	@Test
	public void testMaxEscapeDistance135BurningShip() {
		Main main = new BurningShip();
		main.distanceVal = 2;
		main.passesVal = 135;
		assertEquals(135, main.CalculatePixel(-1.7443359374999874, -0.017451171875000338));
	}
}
