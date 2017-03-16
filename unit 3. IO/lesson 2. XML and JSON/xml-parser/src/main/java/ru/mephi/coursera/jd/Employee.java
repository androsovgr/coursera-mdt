package ru.mephi.coursera.jd;

public class Employee {
	
	private String id;
	private String Firstname;
	private String Lastname;
	private int age;
	private double salary;

	public Employee(String id, String Firstname, String Lastname, int age, double salary) {
		this.id = id;
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "<" + id + ", " + Firstname + ", " + Lastname + ", " + age + ", " + salary + ">";
	}
}
