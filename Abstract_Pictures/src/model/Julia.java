package model;

//Made this Julia class extend the Main class.

public class Julia extends Main {

	// Made all these static variables which store the specific values of Julia
	// set.
	static double minX = -1.7;
	static double maxX = 1.7;
	static double minY = -1.0;
	static double maxY = 1.0;

	// This is the constructor for Julia. The super call stores these values
	// into the Main's parameter so that it can use these
	// specific values.

	public Julia() {
		super(minX, maxX, minY, maxY);
	}

}
