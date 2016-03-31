package autoKPP;

import static autoKPP.AutoKPPTest.SpecTransport;

public class AudiA4 extends PassengerCar {
	// легковой автомобиль
	AudiA4(double capacity, double speed, SpecTransport specTr) {
		this.capacity = capacity;
		this.speed = speed;
		this.isSpec = specTr;
	}

	AudiA4(double capacity, double speed) {
		this.capacity = capacity;
		this.speed = speed;
	}
}
