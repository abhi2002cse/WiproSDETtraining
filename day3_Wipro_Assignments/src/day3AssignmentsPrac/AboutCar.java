package day3AssignmentsPrac;

class Car{
	private boolean engineIsOn;
	private int speed;
	private double fuelLevel;
	
	public void engineStart() {
		engineIsOn = true;
	}
	
	public void engineStop() {
		engineIsOn = false;
		speed = 0;
	}
	
	public void setSpeed(int speed) {
		if(engineIsOn && speed >= 0 ) {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setFuel(double fuel) {
		if(fuel >= 0) {
			fuelLevel = fuel;
		}
	}
	
	public double getFuel() {
		return fuelLevel;
	}
}






public class AboutCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.engineStart();
		car1.setFuel(29.5);
		car1.setSpeed(100);
		
		System.out.println("Speed is : " + car1.getSpeed());
		System.out.println("Fuel Level is : " + car1.getFuel());
		
		car1.engineStop();
		
		System.out.println("Speed after stopping is : " + car1.getSpeed());
		
		
	}
}
