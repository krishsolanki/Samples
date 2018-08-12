package Classes;

public class Student extends Person {

	private int studentID, semester;
	private String major, department;

	public Student() {
		super();
		int counter = 0;
		counter++;
		studentID = counter;
		semester = 1;
		major = "null";
		department = "null";
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
