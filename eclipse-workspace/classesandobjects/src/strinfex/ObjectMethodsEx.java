package strinfex;

public class ObjectMethodsEx implements Cloneable {
	
	int id;
	String name;
	float percentage;
	
	public ObjectMethodsEx(int id, String name,float percentage) {
		super();
		this.id= id;
		this.name = name;
		this.percentage =percentage;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id = " +id+ ",name=" +name+ ",percentage= " +percentage+ "]";
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public static void main(String[] args) throws CloneNotSupportedException {
	 ObjectMethodsEx obj = new ObjectMethodsEx(101,"ashu", (float) 98.34 );
	 System.out.println(obj);
	 ObjectMethodsEx obj2 =(ObjectMethodsEx) obj.clone();
	 System.out.println(obj2);
	 
	 
	 
	}

}
