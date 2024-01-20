package relationshipEx;

public class Test2 {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		emp1.calculate();
		emp1.display();
		
		
		Employee emp2 = new Employee(102,"amit",new Address("502, laxmi tower", "karve road", "thane","mh"), 20000, 12);
		emp2.calculate();
		emp2.display();
	}

}
