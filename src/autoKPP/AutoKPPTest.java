package autoKPP;
 
public class AutoKPPTest {

	public enum SpecTransport {

		AMBULANCE, FIRESUPPORT, VEHICLEINSPECTION
	}
	public static void main(String[] args) throws InterruptedException {

		AudiA4 car1 = new AudiA4(5.5, 6.7, SpecTransport.AMBULANCE);
		RoverMini car2 = new RoverMini(7.0, 60.0);
		Volkswagen car3 = new Volkswagen(5.5, 190, SpecTransport.VEHICLEINSPECTION);
		Volkswagen car4 = new Volkswagen(5.5, 146);
		RoverMini car5 = new RoverMini(7.0, 90.0, SpecTransport.FIRESUPPORT);

		Howo car6 = new Howo(3.0, 5.6, 70, true, SpecTransport.AMBULANCE);
		Howo car7 = new Howo(3.1, 3.1, 70, true);

		Kia car8 = new Kia(11.0, 3.6, 90, false, SpecTransport.VEHICLEINSPECTION);
		Kia car9 = new Kia(11.0, 3.6, 90, true);

		Isuzu car10 = new Isuzu(3.0, 2.6, 200, true, SpecTransport.FIRESUPPORT);
		Isuzu car11 = new Isuzu(10.0, 2.6, 181, false);


		System.out.println("==========================");
		Checkpoint check1 = new Checkpoint(car1);
		check1.run();
		System.out.println("==========================");
		Checkpoint check2 = new Checkpoint(car2);
		check2.run();
		System.out.println("==========================");
		Checkpoint check3 = new Checkpoint(car3);
		check3.run();
		System.out.println("==========================");
		Checkpoint check4 = new Checkpoint(car4);
		check4.run();
		System.out.println("==========================");
		Checkpoint check5 = new Checkpoint(car5);
		check5.run();
		System.out.println("==========================");
		Checkpoint check6 = new Checkpoint(car6);
		check6.run();
		System.out.println("==========================");
		Checkpoint check7 = new Checkpoint(car7);
		check7.run();
		System.out.println("==========================");
		Checkpoint check8 = new Checkpoint(car8);
		check8.run();
		System.out.println("==========================");
		Checkpoint check9 = new Checkpoint(car9);
		check9.run();
		System.out.println("==========================");
		Checkpoint check10 = new Checkpoint(car10);
		check10.run();
		System.out.println("==========================");
		Checkpoint check11 = new Checkpoint(car11);
		check11.run();

	}

}
