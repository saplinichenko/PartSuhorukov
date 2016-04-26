package autoKppThread;
 
import static autoKppThread.AutoKPPTest.SpecTransport;

//Класс описания грузовых автомобилей
public abstract class FreightCar extends Auto {
	double height;// высота
	boolean hasTrailer = false; // наличие прицепа

	FreightCar(double capacity, double height, double speed, boolean hasTrailer, SpecTransport specTr) {
		super.capacity = capacity;
		super.speed = speed;
		super.isSpec = specTr;
		this.height = height;
		this.hasTrailer = hasTrailer;
	}

	FreightCar(double capacity, double height, double speed, boolean hasTrailer) {
		super.capacity = capacity;
		super.speed = speed;
		this.height = height;
		this.hasTrailer = hasTrailer;
	}
}
