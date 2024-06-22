package firstpackage;

public class Day10_This {

	int empID;// instance variable
	String empName;// instance variable
	Day10_This(){
		System.out.println("I am in constructor");
	}
	
	Day10_This(String name){
		this();
		System.out.println("I am in constructor");
	}
	

	public void displayEmpDetails(int empID, String empName) {
		 
		this.empID = empID;
		this.empName = empName;
		this.displayempId();
		System.out.println(empName);
	

	}

	public void displayempId() {
		
		System.out.println(empID);
	}

}
