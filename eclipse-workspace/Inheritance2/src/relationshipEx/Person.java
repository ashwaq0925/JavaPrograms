package relationshipEx;

public class Person 
{
	int id;
	String name;
	Address address;
	
	
	public Person() 
	{
		id = 101;
		name = "ashu";
		address = new Address();
		
	}
	public Person(int id,String name, Address address) 
	{
		this.id = id;
		this.name =name;
		this.address =address;
	}
	public void dsiplay() 
	{
		System.out.println("ID : " +id);
		System.out.println("NAME :" +name);
		address.display();
	}
}
