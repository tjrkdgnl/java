package selfTest;
@SuppressWarnings("unused")

public class Manager extends Employee /* Write the code */{

	private int officeNum;

	private String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name, employeeNum);
		this.officeNum = officeNum;
		this.team = team;
	}
	
	public String toString() {
		return "Name :" + Manager.super.getName() + "\nLocation : " + Manager.super.getDepartment() + ", " + this.officeNum;
	}
}
