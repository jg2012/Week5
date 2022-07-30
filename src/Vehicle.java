
public class Vehicle { //Abstract class. 
	public void honk() {
		System.out.println("Beep");
	}
	
	final class Car extends Vehicle {
		public void beep() {
			try {
				honk();
			}catch (Exception e){
				System.out.println("honk does not exist.");
			}
		
		
		}
		
		
		@Override
		public void info() {
			System.out.println("This is a car, which extends vehicle.");
		}
		
		
		
	}


}
