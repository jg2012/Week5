
public class Cars {
	
	int year; 
	String make; 
	String model;
	
	public Cars() {
		year = 2000; 
		make = "Honda"; 
		model = "Accord"; 
	}

	public static void main(String[] args) {

		
	}
	
	public Cars( int _year,  String _make, String _model) {
		year = _year; 
		make = _make; 
		model = _model; 
	}
	public void honk() {
		System.out.println("Beep beep " + make + "  " + model);
	}
}
