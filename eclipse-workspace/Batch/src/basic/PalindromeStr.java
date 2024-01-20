package basic;
import java.util.Scanner;
public class PalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "";		
		
		for(int i =str.length()-1; i>=0; i--)
		{
			s= s+str.charAt(i);
		}
		if(str.equals(s)) {
		System.out.println("the string is palindrome: " +s);
		}
		else {
			System.out.println("the string is not palindrome: " +s);
		}
	}

}
