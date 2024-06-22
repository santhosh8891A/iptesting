package firstpackage;

public class Student {
	private String name;
	private int studentID;

	public String getName() {
		System.out.println(name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

}
