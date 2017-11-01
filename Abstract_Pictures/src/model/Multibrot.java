package model;

// Made this Multibrot class extend the Main class.

public class Multibrot extends Main {

	// Made all these variables which store the specific values of Multibrot
	// set.
	static double minX = -1.0;
	static double maxX = 1.0;
	static double minY = -1.3;
	static double maxY = 1.3;

	// This is the constructor for Multibrot. The super call stores these values
	// into the Main's parameter so that it can use these
	// specific values.

	public Multibrot() {
		super(minX, maxX, minY, maxY);
	}

}
