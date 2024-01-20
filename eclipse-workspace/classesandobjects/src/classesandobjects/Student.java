package classesandobjects;

public class Student {
	
	int rollNumber;   // instance variable declare inside a class
	String name,city;
	float phy,chem,maths,total,percent;
	
	
	public Student()
	{
		rollNumber = 101;
		name = "riya";
		city = "pune";
		phy = 67;
		chem = 71;
		maths = 62;
		
	}
	// local variables: declaring inside a block or method
	public Student(int id, String n, String c, float p, float m,float ch)
	{
		rollNumber = id;
		name = n;
		city = c;
		phy = p;
		chem = ch;
		maths = m;
	}
	// defining a method
	public void calculator()
	{
		total = phy+chem+maths;
		percent = total/3;
	}
	//display student info
	public void display()
	{
		System.out.println("student information: ");
		System.out.println("Roll number " +rollNumber);
		System.out.println("Student name: " +name);
		System.out.println("city : " +city);
		System.out.println("Total: " +total);
		System.out.println();
	}
}
