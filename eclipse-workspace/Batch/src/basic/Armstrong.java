package basic;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0,n,rev,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		n = sc.nextInt();
		int temp = n;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("the number  is  Armstrong number: " +temp );
		}
		else {
			System.out.println("the number  is not Armstrong number: " +temp);
		}
	}

}
