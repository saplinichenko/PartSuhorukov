package autoKPP;

import autoKPP.AutoKPPTest.SpecTransport;

public class Isuzu extends FreightCar {
	// грузовой автомобиль
	Isuzu(double capacity, double height, double speed, boolean hasTrailer, SpecTransport specTr) {
		this.isSpec = specTr;
		this.capacity = capacity;
		this.height = height;
		this.speed = speed;
		this.hasTrailer = hasTrailer;
	}

	Isuzu(double capacity, double height, double speed, boolean hasTrailer) {
		this.capacity = capacity;
		this.height = height;
		this.speed = speed;
		this.hasTrailer = hasTrailer;
	}
}
