package basic;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi this is MD Ashwaq";
		
		
		String splitedStrings [] = str.split(" ");
		for (String string: splitedStrings) {
			System.out.print(string+" ");
			
		}
		
		System.out.println("count of words: " +splitedStrings.length);
	}

}
