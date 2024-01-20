package classesandobjects;

import java.util.Scanner;

public class DefaultMethodEx {
	int a,b;  // instance
	
	public void acceptNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	public void add() {
		System.out.println("ADD : " +(a+b));
	}
	public int sub() {
		int c = a-b;
		return c; 
	}
	
}
