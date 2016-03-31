package autoKPP;

import autoKPP.AutoKPPTest.SpecTransport;

public class Howo extends FreightCar {
	// грузовой автомобиль
	
	Howo(double capacity, double height, double speed, boolean hasTrailer, SpecTransport specTr) {
		this.isSpec = specTr;
		this.capacity = capacity;
		this.height = height;
		this.speed = speed;
		this.hasTrailer = hasTrailer;
	}

	Howo(double capacity, double height, double speed, boolean hasTrailer) {
		this.capacity = capacity;
		this.height = height;
		this.speed = speed;
		this.hasTrailer = hasTrailer;
	}
}
