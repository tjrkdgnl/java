package selfTest;

@SuppressWarnings("unused")
public class Engineer extends Employee{
	private String workZone;
	
	private String project;
	
	public Engineer(String name,int employeeNum,String workZone,String project) {
		super(name,employeeNum);
		this.workZone = workZone;
		this.project = project;
		
	}
	
	public boolean equals(Object obj) {
		if(obj ==null)
			return false;
		else if(this.getClass() != obj.getClass())
			return false;
		
		else {
			
			Engineer ortherEmp = (Engineer) obj;
			
			if(this.getName().equals(ortherEmp.getName()) && this.getEmployeeNum() == ortherEmp.getEmployeeNum() && this.getDepartment() == ortherEmp.getDepartment() && this.workZone == ortherEmp.workZone)
				return true;
			else
				return false;
		}
	}
	
	public String toString() {
		
		return "Name: " + this.getName() + "\nEmp#: " + this.getEmployeeNum() + "\nlocation :" + this.getDepartment() + ", " + this.workZone ;
	}
}
