package autoKPP;

import autoKPP.AutoKPPTest.SpecTransport;

public class Volkswagen extends PassengerCar {
	//легковой автомобиль
	Volkswagen(double capacity, double speed, SpecTransport specTr) {
		this.capacity = capacity;
		this.speed = speed;
		this.isSpec = specTr;
	}

	Volkswagen (double capacity, double speed) {
		this.capacity = capacity;
		this.speed = speed;
	}
}
