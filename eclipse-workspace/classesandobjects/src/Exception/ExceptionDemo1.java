package Exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		
		int a= 10, b=0;
		try {
			int c=a/b;
			System.out.println("div : " +c);
		}
		catch (ArithmeticException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("rest of code.....");

	}

}
