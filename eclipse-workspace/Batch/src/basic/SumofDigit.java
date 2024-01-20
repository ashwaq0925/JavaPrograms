package basic;
import java.util.Scanner;
public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rem,sum = 0;
		System.out.println("enter digit of numbers: ");
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		while(n>0) {
			rem = n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("add of digits is: " +sum);
	}
}
