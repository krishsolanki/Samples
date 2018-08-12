package Classes;

public class Instructor {

	private int instructorID, classesTeaching, yearsWorking, salary;
	private String degree, major, department;

	public Instructor() {
		super();
		int counter = 0;
		counter++;
		instructorID = counter;
		classesTeaching = 0;
		yearsWorking = 0;
		salary = 100000;
		degree = "null";
		major = "null";
		department = "null";
	}
	
	public Instructor(int classesTeaching, int yearsWorking, int salary, 
			String degree, String major, String department) {
		super();
		int counter = 0;
		counter++;
		instructorID = counter;
		this.classesTeaching = classesTeaching;
		this.yearsWorking = yearsWorking;
		this.salary = salary;
		this.degree = degree;
		this.major = major;
		this.department = department;
	}

	public int getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}

	public int getClassesTeaching() {
		return classesTeaching;
	}

	public void setClassesTeaching(int classesTeaching) {
		this.classesTeaching = classesTeaching;
	}

	public int getYearsWorking() {
		return yearsWorking;
	}

	public void setYearsWorking(int yearsWorking) {
		this.yearsWorking = yearsWorking;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
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
