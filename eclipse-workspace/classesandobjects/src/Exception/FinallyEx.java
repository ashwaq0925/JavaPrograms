package Exception;

public class FinallyEx {

	public static void main(String[] args) {
		
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			//e.printStackTrace();
		System.err.println(e);
		}
		finally {
			System.out.println("finally blocks always Executes");
		}
		System.out.println("case 1: exception occurs and handled");
	}

}
