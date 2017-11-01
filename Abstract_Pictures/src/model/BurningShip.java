package model;

//Made this BurningShip class extend the Main class.

public class BurningShip extends Main {

	// Made all these static variables which store the specific values of
	// BurningShip set.
	public static double minX = -1.8;
	public static double maxX = -1.7;
	public static double minY = -0.08;
	public static double maxY = 0.025;

	// This is the constructor for BurningShip. The super call stores these
	// values into the Main's parameter so that it can use these
	// specific values.

	public BurningShip() {
		super(minX, maxX, minY, maxY);
	}

}
