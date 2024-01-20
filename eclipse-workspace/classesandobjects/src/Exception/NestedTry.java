package Exception;

public class NestedTry {

	public static void main(String[] args) {
		try {
			
			try {
				
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
