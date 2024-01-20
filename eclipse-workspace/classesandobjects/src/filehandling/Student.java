package filehandling;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionID =1L;
	private int id;
	private String name;
	public Student(int id,String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		
		return "Student [id=" +id +",name" +name +"]";
	}
	

}
