package firstpackage;

public class CallConst {

	public static void main(String[] args) {

		StudentDetails stddetails= new StudentDetails();
		stddetails.displayStudentDetails("Sai",123);
		
		System.out.println("----------------------------------");
		StudentDetails stddetails2= new StudentDetails();
		stddetails2.displayStudentDetails("Jayanth", 124);
		
		System.out.println("----------------------------------");
		StudentDetails stddetails3= new StudentDetails();
		stddetails2.displayStudentDetails("Vishnu", 125);
	}

}
