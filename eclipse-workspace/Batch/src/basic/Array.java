package basic;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,4,5};
		int i;
		
		for( i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		// accepting array elements from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size : ");
		int size = sc.nextInt();
		int b[] =new int[size];
		
		System.out.println("enter" +size+"array elements");
		for(i=0; i<size; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Array :");
		for(i=0; i<size; i++)
		{
			System.out.println(b[i]);
		}
			
	}

}
