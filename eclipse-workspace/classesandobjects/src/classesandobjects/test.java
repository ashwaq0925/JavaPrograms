package classesandobjects;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Student student1 = new Student();
		student1.calculator();
		student1.display();
		
		Student student2 = new Student(102, "paras", "mumbai",45,52,57);
				student2.calculator();
				student2.display(); */
		
		
		DefaultMethodEx obj = new DefaultMethodEx();
		obj.acceptNumbers();
		obj.add();
		int r = obj.sub();
		System.out.println("sub :" +r); 
		
		
	}

}
