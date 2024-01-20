package classesandobjects;
class School
{
	public void fun()
	{
		System.out.println("fun");
	}
}
class Teacher extends School
{
	public void teach()
	{
		System.out.println("teacher teacher");
	}
}
class Student2 extends Teacher
{
	public void learn()
	{
		System.out.println("Student learns");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stnt = new Student2();
		stnt.fun();
		stnt.teach();
		stnt.learn();
		
		
	}

}
