package basic;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,Fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		
		num = sc.nextInt();
		for(int i=1; i<num; i++) 
		{
			Fact = i*Fact;
		}
		System.out.println("Fact of number: "+num+"="+Fact);
		
	}

}
