package ExceptionEx;

public class ThrowDemo {

	public static void checkAge(int age) {
		if(age>=18)
			System.out.println("welcome to vote");
		else
			throw new ArithmeticException("age is not valid");
		

	}
	
	public static void main(String[] args) {
		try {
			ThrowDemo.checkAge(9);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of code: ");
	}

}