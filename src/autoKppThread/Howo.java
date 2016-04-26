package autoKppThread;

import autoKppThread.AutoKPPTest.SpecTransport;

public class Howo extends FreightCar {
	// грузовой автомобиль

	Howo(double capacity, double height, double speed, boolean hasTrailer, SpecTransport specTr) {
		super(capacity, height, speed, hasTrailer, specTr);
	}

	Howo(double capacity, double height, double speed, boolean hasTrailer) {
		super(capacity, height, speed, hasTrailer);
	}
}
