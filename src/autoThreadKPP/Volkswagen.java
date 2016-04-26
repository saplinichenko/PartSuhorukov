package autoThreadKPP;

import autoThreadKPP.AutoKPPTest.SpecTransport;

public class Volkswagen extends PassengerCar {
	// легковой автомобиль
	Volkswagen(double capacity, double speed, SpecTransport specTr) {
		super(capacity, speed, specTr);
	}

	Volkswagen(double capacity, double speed) {
		super(capacity, speed);
	}
}
