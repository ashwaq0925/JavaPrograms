package Exception;

public class MulticatchEx {

	public static void main(String[] args) {
		try {
			int a[] =new int[5];
			a[7] = 12/0;
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of code.....");
	}

}
