package basic;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = Sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(n + " x "  + i +  " = " + n*i);
		}
		
	}

}
