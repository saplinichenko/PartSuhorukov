package autoThreadKPP;
 
import autoThreadKPP.AutoKPPTest.SpecTransport;

public class Kia extends FreightCar {
	// грузовой автомобиль
	Kia(double capacity, double height, double speed, boolean hasTrailer, SpecTransport specTr) {
		super(capacity, height, speed, hasTrailer, specTr);
	}

	Kia(double capacity, double height, double speed, boolean hasTrailer) {
		super(capacity, height, speed, hasTrailer);
	}
}
