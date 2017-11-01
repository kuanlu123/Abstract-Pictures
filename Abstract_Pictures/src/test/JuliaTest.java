package test;

//created by Kuan
import static org.junit.Assert.*;

import org.junit.Test;

import model.Julia;
import model.Main;

public class JuliaTest {
	// Translate a pixel's row to the associated x-coordinate in the fractal
	@Test
	public void testRowsJulia() {
		Julia t1 = new Julia();
		assertEquals(-1.7, t1.xCalculate(0), 0.01);
		assertEquals(-0.0398, t1.xCalculate(250 * 4), 0.01);
		assertEquals(1.7, t1.xCalculate(512 * 4), 0.01);

	}

	// Translate a pixel's column to the associated y-coordinate in the fractal
	@Test
	public void testCollJulia() {
		Julia t1 = new Julia();
		assertEquals(-1.0, t1.yCalculate(0), 0.01);
		assertEquals(-0.023, t1.yCalculate(250 * 4), 0.01);
		assertEquals(1, t1.yCalculate(512 * 4), 0.01);

	}

	// Calculates the escape time for a coordinate whose distance from the
	// origin exceeds the escape distance after a single loop pass (updated)
	@Test
	public void testEscapeTimeMinJulia() {
		Main main = new Julia();
		main.distanceVal = 2;
		assertEquals(1, main.CalculatePixel(1.6933593749999853, 0.9765625));
	}

	// Calculates the escape time for a coordinate whose distance from the
	// origin never exceeds the escape distance (updated)
	@Test
	public void testEscapeTimeMaxJulia() {
		Main main = new Julia();
		main.distanceVal = 2;
		main.passesVal = 255;
		assertEquals(255, main.CalculatePixel(1.0492187499999897, -0.234375));
	}

	// Checks if grid is correctly made.
	@Test
	public void testGridMake() {
		Julia t1 = new Julia();
		assertEquals(512 * 4, t1.gridMake().length);
		assertEquals(512 * 4, t1.gridMake()[0].length);
	}

	// This tests when the escape distance is set to 3 and calculates the escape
	// time for a coordinate whose distance from the
	// origin exceeds the escape distance after a 10 passes of the loop.
	@Test
	public void testEscapeTimeDistance3Julia() {

		Main main = new Julia();
		main.distanceVal = 3;
		assertEquals(10, main.CalculatePixel(1.4538160469667272, -0.13502935420743645));
	}

	// This test just checks that when the escape distance is 2 the calculate
	// pixel wont exceed the maximum escape distance 135.
	@Test
	public void testMaxEscapeDistance135Julia() {
		Main main = new Julia();
		main.distanceVal = 2;
		main.passesVal = 135;
		assertEquals(135, main.CalculatePixel(1.0492187499999897, -0.234375));
	}

}
