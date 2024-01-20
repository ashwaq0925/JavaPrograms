package basic;

public class LARGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to EduBridge";
		String splStr[] = str.split("");
		int max = splStr[0].length();
		for(int i=0; i<splStr[i].length(); i++) {
			
			if(splStr[i].length()>max) {
				max = splStr[i].length();
				System.out.println(splStr[i]);
			}
			
		}
	}

}
