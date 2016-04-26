package autoThreadKPP;
 
import autoThreadKPP.AutoKPPTest.SpecTransport;

//Класс описания легковых автомобилей
public abstract class PassengerCar extends Auto {

	PassengerCar(double capacity, double speed, SpecTransport specTr) {
		super.capacity = capacity;
		super.speed = speed;
		super.isSpec = specTr;
	}

	PassengerCar(double capacity, double speed) {
		super.capacity = capacity;
		super.speed = speed;

	}

}