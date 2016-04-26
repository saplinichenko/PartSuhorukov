package autoKppThread;

public class PrintInfoPassengerThread extends Checkpoint implements Runnable {
	
	PrintInfoPassengerThread(int fareAll, String fareName, int farePassenger, int priceFine) {
		this.fareAll = fareAll;
		this.fareName = fareName;
		this.priceFine = priceFine;
		this.farePassenger = farePassenger;
	}

	@Override
	public void run() {
		System.out.println("Марка частного легкового автомобиля: " + this.fareName);
		System.out.println("Стоимость проезда = " + this.fareAll + " рублей. Где: ");
		System.out.println(farePassenger + " руб. - пошлина за въезд легкового автомобиля");
		System.out.println(priceFine + " руб. - штраф за превышение скорости");

	}

}
