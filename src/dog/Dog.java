package dog;


import java.util.Random;

public class Dog {
	boolean isHungry;
	boolean isThirsty;
	boolean needsWalk;
	boolean isHappy;
	String color;
	String name;
	String race;
	int age;
	int weight;
	boolean isPresent;
	
	public Dog(String color, String name){
		this.color = color;
		this.name = name;
		}
		
	public Dog(){
		System.out.println("This is the dog");
		}
		
	public Dog(String name, String race, int age, int weight){
		this.name = name;
		this.race = race;
		this.age = age;
		this.weight = weight;
		}
		
	public void nakarmPsa(int i){
		if(i<1){
			System.out.println("The dog is still hungry.");
		}{
		if(i>1 && i<5){
			System.out.println("The dog is not hungry anymore.");
			}
		else{
			System.out.println("The dog ate too much and is sick.");}
	}}
		
		public boolean cureDog(Doctor doctor){
			
			if (doctor.present) {
				System.out.println("THe dog is cured.");
			}
			else{
				System.out.println("There is no doctor.Dog is dead. Buy a new dog.");
			}
			return doctor.present;}	
			
		Random random = new Random();
		public void cureDog2(){
			
			int chance = random.nextInt(100);
			if (chance>=50) {
				isPresent = true;
				System.out.println("THe dog is cured.");
			}
				
			else  {
				System.out.println("There is no doctor.Dog is dead. Buy a new dog.");}
		}
		
}


	
			

		

