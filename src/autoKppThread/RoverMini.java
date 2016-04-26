package autoKppThread;
 
import autoKppThread.AutoKPPTest.SpecTransport;

public class RoverMini extends PassengerCar {
	// легковой автомобиль
	RoverMini(double capacity, double speed, SpecTransport specTr) {
		super(capacity, speed, specTr);
	}

	RoverMini(double capacity, double speed) {
		super(capacity, speed);

	}
}
