package basic;
import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 2 numbers:");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			System.out.println("Add : " +c);
			System.out.println("Press Y for continue :");
			ch =sc.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
	}

}
