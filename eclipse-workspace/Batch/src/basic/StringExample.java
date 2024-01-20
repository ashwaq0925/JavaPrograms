package basic;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HEllo world";
		System.out.println(str);
		String str2 = new String("Welcome to EduBridge");
		System.out.println(str2);
		
		
		String s1 = "Welcome" ,s2="hello", s3 = "welcome", s4 = "welcome to edubridge";
		
		
		
		System.out.println("charAt(3) : " +s1.charAt(3));
		
		System.out.println("length ; " +s2.length());
		
		System.out.println("contains(e) : " +s1.contains("e"));
		
		System.out.println("subString:(3)" +s1.substring(3));
		
		System.out.println("substring:(2,5):" +s1.substring(2,5));
		
		System.out.println("s1.equals(s3)" +s1.equals(s3));
		
		System.out.println("s1.eqaulsIgnoreCase(s3): " +s1.equalsIgnoreCase(s3));
		
		System.out.println("isEmpty() :" +s2.isEmpty());
		
		System.out.println("concat:" +s2.concat("user"));
		
		System.out.println("indexof('e'):" +s1.indexOf("e"));
		
		System.out.println(s2);
		
		s2= s2.concat("user");
		System.out.println(s2);
		
		System.out.println("replace('e','a':" +s3.replace('e','a'));
		
		System.out.println("uppercase: " +s1.toUpperCase());
		System.out.println("lowercase: " +s1.toLowerCase());
		
		System.out.println("length before trim: " +s4.length());
		s4=s4.trim();
		System.out.println("length after trim: " +s4.length());
		
		
		String splitedStrings [] = str2.split(" ");
		for (String string: splitedStrings) {
			System.out.print(string+" ");
			
		}
		
		System.out.println("count of words " +splitedStrings.length);
		
	}

}
