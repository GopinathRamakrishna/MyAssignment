package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("I am driving a Car");
	}

	public void applyBrake() {
		System.out.println("I am going to apply brake");
	}
	
	public void soundHorn() {
		System.out.println("applied horn");
	}
	
	public void isPuncture() {
		System.out.println("Car was puncture");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car Car = new Car();
		Car.driveCar();
		Car.applyBrake();
		Car.soundHorn();
		Car.isPuncture();

	}

}
