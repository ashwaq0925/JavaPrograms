package basic;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numberes");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a+b;
		
		System.out.println("Addition of "+a+" and "+b+": " +c);
	}

}
