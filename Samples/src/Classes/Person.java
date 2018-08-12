package Classes;

public class Person {
	private String name, lastName, address; 
	private int age;

	public Person(String name, String lastName, String address, int age) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
	}

	public Person() {
		name = "FirstName";
		lastName = "SecondName";
		address = "City";
		age = 30;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
