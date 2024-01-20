package abstraction;

public class Encapsulation 
{
	
	private int id;
	private String name,phoneNumber;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setId(201);
		encapsulation.setName("ashwaq");
		encapsulation.setPhoneNumber("9059774247");
		
		System.out.println("ID :" +encapsulation.getId());
		System.out.println("name: " +encapsulation.getName());
		System.out.println("PhoneNumber : " +encapsulation.getPhoneNumber());
		
	}

}
