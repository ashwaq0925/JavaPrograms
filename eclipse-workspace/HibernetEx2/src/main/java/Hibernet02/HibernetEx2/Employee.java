package Hibernet02.HibernetEx2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employee {
	@Id
	private int id;
	private String Name;
	private int salary;
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {
		

	}

}
