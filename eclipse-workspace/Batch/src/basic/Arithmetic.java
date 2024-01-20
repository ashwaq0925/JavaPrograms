package basic;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers: 9");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		System.out.println("Addition of  a and b is: " +c);
		System.out.println("Subtraction of  a and b is: " +d);
		System.out.println("Multiplication of  a and b is: " +e);
		System.out.println("division of  a and b is: " +f);
		
				
	}

}
