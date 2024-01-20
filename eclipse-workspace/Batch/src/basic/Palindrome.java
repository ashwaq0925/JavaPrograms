package basic;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0, n, rem, rev ;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number: ");
		n = sc.nextInt();
		int temp=n;
		while(n>0) {
			rem=n%10;
			sum=rem+(sum*10);
			n=n/10;
		
		}
		if(temp==sum) {
			System.out.println("it is a palindrome: " +temp );
		}
		else {
			System.out.println("It is not a palindrome: " +temp);
		}
	}

}
