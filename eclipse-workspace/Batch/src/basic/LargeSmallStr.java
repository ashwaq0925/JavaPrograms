package basic;

public class LargeSmallStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to EduBridge institute";
		String str2 = "";
		String str3= "";
		
		String splStr[] = str.split(" ");
		int max = splStr[0].length();
		int min = splStr[0].length();
		for(int i=1; i<splStr.length; i++) 
		{
			
			if(splStr[i].length() > max)
			{
				str2 = splStr[i];
							}
			if(splStr[i].length()< min)
			{
				str3 = splStr[i];
			}
			
		}
		System.out.println("the large string is: "+str2);
		System.out.println("the smaller string is: "+str3);
	}

}
