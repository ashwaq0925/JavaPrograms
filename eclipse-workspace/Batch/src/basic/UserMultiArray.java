package basic;
import java.util.Scanner;
public class UserMultiArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] =new int[size];
		int i,j;
		
		System.out.println("enter" +size+"row elements");
		System.out.println("enter" +size+"column elements");
		for(i=0; i<size; i++)
		for(j=0; j<size; j++){
			a[i] = sc.nextInt();
			b[j] = sc.nextInt();
		}
		System.out.println("Array :");
		System.out.println("Array :");
		for(i=0; i<size; i++)
			for(j=0; j<size; j++)
		{
			System.out.println(a[i]);
			System.out.println(b[j]);
		}
	}
}

