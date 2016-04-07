package autoKPP;
 
import autoKPP.AutoKPPTest.SpecTransport;

public class Checkpoint {
	int fareAll; // общая стоимость
	String fareName; // Наименование марки автомобиля
	int farePassenger = 1000; // пошлина на проезд легковой авто
	int fareFreight = 2000; // пошлина на проезд грузовой авто
	int priceTrailer = 500;// размер пошлины за прицеп
	int priceCapacity = 800;// размер пошлины за превышение веса (10тонн)
	int priceFine = 0; // размер штрафа
	double currentSpeed; // скорость
	boolean hasTrailer = false; // наличие прицепа
	double capacity; // грузоподемность
	double height; // высота
	SpecTransport isSpec2; // является ли авто спец.транспортом
	Object tmpCar; // временный объект

	Checkpoint(FreightCar fCar) {
		tmpCar = (FreightCar) tmpCar;
		this.tmpCar = fCar;
		this.isSpec2 = fCar.isSpec;
		this.currentSpeed = fCar.speed;
		this.hasTrailer = fCar.hasTrailer;
		this.capacity = fCar.capacity;
		this.height = fCar.height;
		this.fareName = tmpCar.getClass().getName().substring(8);
		// Имя марки машины.
		// Возвращаем имя класса при помощи метода getClass().getName()
		// А потом при помоши substring(8) обрезаем первые 8 символов: имя
		// пакета "autoKPP."
	}

	Checkpoint(PassengerCar pCar) {
		tmpCar = (PassengerCar) tmpCar;
		this.tmpCar = pCar;
		this.isSpec2 = pCar.isSpec;
		this.currentSpeed = pCar.speed;
		this.fareName = tmpCar.getClass().getName().substring(8);
		// Имя марки машины.
		// Возвращаем имя класса при помощи метода getClass().getName()
		// А потом при помоши substring(8) обрезаем первые 8 символов: имя
		// пакета "autoKPP."
	}

	public void speedLimit() {
		if (currentSpeed >= 80.0 && currentSpeed <= 180.0) {
			priceFine = 255;
		} else if (currentSpeed >= 180.0) {
			System.out.println("ВНИМАНИЕ!!! Нарушение скоростного порядка! Всем патрулям: марка машины: " + fareName);
		}
	}

	public void printInfo(int tmpFareAll) {
		System.out.println("Марка частного легкового автомобиля: " + fareName);
		System.out.println("Стоимость проезда = " + tmpFareAll + " рублей. Где: ");
		System.out.println(farePassenger + " руб. - пошлина за въезд легкового автомобиля");
		System.out.println(priceFine + " руб. - штраф за превышение скорости");

	}

	public void printInfo(int tmpFareAll, int tmpFreight, int priceFine, int tmpTrailer, int tmpCapacity) {
		System.out.println("Марка частного грузового автомобиля: " + fareName);
		System.out.println("Стоимость проезда = " + tmpFareAll + " рублей. Где: ");
		System.out.println(tmpFreight + " руб. - пошлина за въезд легкового автомобиля");
		System.out.println(tmpTrailer + " руб. - пошлина за прицеп");
		System.out.println(tmpCapacity + " руб. - пошлина за превышение веса (более 10 тонн)");
		System.out.println(priceFine + " руб. - штраф за превышение скорости");

	}

	public void calculateBill() {
		if (this.isSpec2 != null) {
			switch (this.isSpec2) { // Проверяем на спец.транспорт
			case AMBULANCE:
				System.out.println("Марка машины: " + fareName);
				System.out.println("Скорая помощь. Проезд открыт");
				break;
			case FIRESUPPORT:
				System.out.println("Марка машины: " + fareName);
				System.out.println("Пожарная служба. Проезд открыт");
				break;
			case VEHICLEINSPECTION:
				System.out.println("Марка машины: " + fareName);
				System.out.println("Автоинспекция. Проезд открыт");
				break;
			}
		} else if (this.tmpCar instanceof PassengerCar) {
			speedLimit(); // проверяем скорость
			// стоимость проезда легкового + штрав
			fareAll = farePassenger + priceFine;
			printInfo(fareAll);

		} else if (this.tmpCar instanceof FreightCar) {
			speedLimit();// проверяем скорость

			// стоимость проезда грузового + штрав
			if (height > 4) {
				System.out.println("Проезд невозможен!!!");

			} else if (height <= 4 && this.hasTrailer && this.capacity > 10.0) {
				fareAll = fareFreight + priceFine + priceTrailer + priceCapacity;
				printInfo(fareAll, fareFreight, priceFine, priceTrailer, priceCapacity);

			} else if (height <= 4 && this.hasTrailer && this.capacity < 10.0) {
				fareAll = fareFreight + priceFine + priceTrailer + 0;
				printInfo(fareAll, fareFreight, priceFine, priceTrailer, 0);

			} else if (height <= 4 && !this.hasTrailer && this.capacity > 10.0) {
				fareAll = fareFreight + priceFine + 0 + priceCapacity;
				printInfo(fareAll, fareFreight, priceFine, 0, priceCapacity);

			} else if (height <= 4 && !this.hasTrailer && this.capacity < 10.0) {
				fareAll = fareFreight + priceFine + 0 + 0;
				printInfo(fareAll, fareFreight, priceFine, 0, 0);

			}

		}

	}

}
