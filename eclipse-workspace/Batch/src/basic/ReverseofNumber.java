package basic;
import java.util.Scanner;
public class ReverseofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rem;
		System.out.println("enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
			while(n>0) {
			rem =n%10;
			System.out.print(rem);
			n=n/10;
		}
		
	}

}
