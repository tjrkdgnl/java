package selfTest;

public class Employee {

	
	private String name;
	private int age;
	private String Position;
	private int salary;
	private int vacationDay;
	
	
	public Employee(String name, int age, String Position,int salary,int vacationDay) {
		this.name = name;
		this.age = age;
		this.Position =Position;
		this.salary = salary;
		this.vacationDay =vacationDay;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		
		if(this.Position == null)
		{
			this.Position = "Engineer";
			
		}
		
		if(this.salary ==0) 
		{
			this.salary =15000;
			this.vacationDay =20;
		}
		
		if(this.vacationDay ==0) {
			this.vacationDay =20;
		}
	}
	
	public Employee(String name, int age, String Position,int salary) {
		this.name = name;
		this.age = age;
		this.Position =Position;
		this.salary = salary;
		
		if(this.Position == null)
		{
			this.Position = "Engineer";
			
		}
		
		if(this.salary ==0) 
		{
			this.salary =15000;
			this.vacationDay =20;
		}
		
		if(this.vacationDay ==0) {
			this.vacationDay =20;
		}
	}
	
	
	
	public void setSalary(int sal) {

		this.salary = sal;
	}
	
	public void outInfo() {
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		System.out.println("Position: " + this.Position);
		System.out.println("salary: " + this.salary);
		System.out.println("vacationDay: " + this.vacationDay);
	}
	
	public String vacation(int vacationDay) {
		
		if(this.vacationDay >= vacationDay) {
			this.vacationDay -=vacationDay;
			return "Possible";
		}
		else {
				return "Impossible";
		}
	}
	
	public boolean equals(Employee emplo) {
		
		if(this.name.equals(emplo.name) && this.age ==emplo.age) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
