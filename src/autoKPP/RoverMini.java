package autoKPP;

import autoKPP.AutoKPPTest.SpecTransport;

public class RoverMini extends PassengerCar {
	//легковой автомобиль
	RoverMini(double capacity, double speed, SpecTransport specTr) {
		this.capacity = capacity;
		this.speed = speed;
		this.isSpec = specTr;
	}

	RoverMini(double capacity, double speed) {
		this.capacity = capacity;
		this.speed = speed;
	}
}
