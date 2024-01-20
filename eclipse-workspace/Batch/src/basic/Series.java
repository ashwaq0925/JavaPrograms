package basic;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		n =sc.nextInt();
		for(int i=1; i<=n; i=i+2) 
		{
			System.out.println(" "+i+"");
		}
	}

}
