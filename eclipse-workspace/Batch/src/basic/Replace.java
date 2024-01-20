package basic;
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		System.out.println("enter a character to replace:");
		String a = sc.next();
		System.out.println("enter a character wants to replace:");
		String b = sc.next();
		System.out.println("the string is" +str.replace(a, b));
	}

}
