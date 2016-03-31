package autoKPP;

import autoKPP.AutoKPPTest.SpecTransport;

public class Kia extends FreightCar {
	// грузовой автомобиль
	Kia(double capacity, double height, double speed, boolean hasTrailer, SpecTransport specTr) {
		this.isSpec = specTr;
		this.capacity = capacity;
		this.height = height;
		this.speed = speed;
		this.hasTrailer = hasTrailer;
	}

	Kia(double capacity, double height, double speed, boolean hasTrailer) {
		this.capacity = capacity;
		this.height = height;
		this.speed = speed;
		this.hasTrailer = hasTrailer;
	}
}
