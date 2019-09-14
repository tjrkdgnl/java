package selfTest;

public class EmployeeManager {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Employee Employee1 = new Employee("Walter White",42,"Manager",20000);
		Employee Employee2 = new Employee("Jesse Pinkman",32,"Assitant Manager",12000,7);
		Employee Employee3 = new Employee("jimmie McGill",38);
		Employee Employee4 = new Employee("Chuck Mcgill",40);
		Employee Employee5 = new Employee("Walter White",42,"Manager",20000);
		
		Employee1.setSalary(21000);
		Employee1.outInfo();
		
		System.out.println("");
		
		Employee2.outInfo();
		
		System.out.println("");
		
		System.out.println(	Employee3.vacation(10));
		System.out.println(	Employee2.vacation(10));	

		System.out.println("");
		Employee3.outInfo();

		System.out.println("");
		
		System.out.println(Employee1.equals(Employee2));
		System.out.println(Employee1.equals(Employee5));
		
	
		
		
	}

}
