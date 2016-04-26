package autoKppThread;
 
import autoKppThread.AutoKPPTest.SpecTransport;

public class Isuzu extends FreightCar {
	// грузовой автомобиль
	Isuzu(double capacity, double height, double speed, boolean hasTrailer, SpecTransport specTr) {
		super(capacity, height, speed, hasTrailer, specTr);
	}

	Isuzu(double capacity, double height, double speed, boolean hasTrailer) {
		super(capacity, height, speed, hasTrailer);
	}
}
