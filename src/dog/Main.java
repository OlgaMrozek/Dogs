package dog;


public class Main {

	public static void main(String[] args) {
	Dog jamnik = new Dog("brown", "Pimpek");
	Dog york = new Dog();
	Dog kundel = new Dog("Azor", "kundel", 3, 5);
	Doctor doctor = new Doctor(true);
	
	
	
	System.out.println("Jamnik dog:");
	jamnik.nakarmPsa(5);
	
	
	System.out.println("Jamnik dog:");
	jamnik.cureDog2();
	System.out.println("York dog:");
	york.cureDog2();
	System.out.println("Kundel dog:");
	kundel.cureDog2();
	}
	

	}

