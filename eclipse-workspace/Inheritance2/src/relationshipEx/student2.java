package relationshipEx;

public class student2 {
	int id;
	String name;
	static String colgName = "NMREC";
	
	
	public student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void changeColgNAme(String name) {
		colgName = name;
	}

	@Override
	public String toString() {
		return "student2 [id=" + id + ", name=" + name + ",colgName = " +colgName+"]";
	}
	public static void main(String[] args) {
		student2 student3 = new student2(101,"ashu");
		student2 student4 = new student2(102,"ashwaq");
		System.out.println(student3);
		System.out.println(student4);
	}

}
