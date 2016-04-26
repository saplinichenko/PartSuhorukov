package autoKppThread;

public class PrintInfoFreightThread extends Checkpoint implements Runnable {
	int fareAll;
	
	PrintInfoFreightThread(int fareAll, String fareName, int fareFreight, int priceFine, int priceTrailer, int priceCapacity) {
		this.fareAll = fareAll;
		this.fareName = fareName;
		this.fareFreight = fareFreight;
		this.priceFine = priceFine;
		this.priceTrailer = priceTrailer;
		this.priceCapacity = priceCapacity;
	}

	@Override
	public void run() {
		System.out.println("Марка частного грузового автомобиля: " + fareName);
		System.out.println("Стоимость проезда = " + fareAll + " рублей. Где: ");
		System.out.println(fareFreight + " руб. - пошлина за въезд легкового автомобиля");
		System.out.println(priceTrailer + " руб. - пошлина за прицеп");
		System.out.println(priceCapacity + " руб. - пошлина за превышение веса (более 10 тонн)");
		System.out.println(priceFine + " руб. - штраф за превышение скорости");

	}

}
