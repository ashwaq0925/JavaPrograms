package relationshipEx;
//method overriding same method name having same parameters and parent class
public class Employee extends Person 
{
	double workingDays,perDay,salary;
	
	public Employee() {
		super();
		workingDays = 8;
		perDay = 2000;
	}
	
	public Employee(int id, String name, Address address, double workingDays, double perDay)
	{
		super(id,name,address);
		this.workingDays=workingDays;
		this.perDay=perDay;
	}
	
	public void calculate()
	{
		salary = workingDays * perDay;
	}
	
	public void display() {
		super.dsiplay();  //super keyword to call parent class and data members		
		System.out.println("salary ; " +salary);
	}
	
}
