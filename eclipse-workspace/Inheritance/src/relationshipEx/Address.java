package relationshipEx;

public class Address 
{
	String addrLine,street,state,country,pincode; //instance variable
	
	public Address() 
	{
		addrLine = "102 malakpet";
		street = "racce course road";
		state = "telangana";
		country = "India";
		pincode = "500036";
	}
	
	public Address(String addrLine,String street, String state, String country) {
		super();
		this.addrLine =addrLine;
		this.street = street;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public void display()
	{
		System.out.println("Address ;" +addrLine+","+street+"," +state+ "," +country+ "," +pincode);
	}

}
