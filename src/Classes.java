
public class Classes {

	public static void main(String[] args) {

		StringBuilder name = new StringBuilder(); 
		StringBuilder name2 = new StringBuilder(); 
		
		Student student1 = new Student(); 
		student1.firstName = "Tom"; 
		student1.lastName = "Smith"; 
		student1.gradeLevel = 12; 
		student1.phoneNumber = "480 - 123 - 4567";
		
		student1.intoduce();  
		
		Student student2 = new Student("Sammy" , " Jones");
		student2.intoduce(); 
		
		Student student3 = new Student("Tom", "Riddle", "904-320-9076", 11); 
		student3.intoduce(); 
	}

}
