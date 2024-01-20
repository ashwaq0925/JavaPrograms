package ExceptionEx;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ThrowsExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b,c;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(reader.readLine());
		b=Integer.parseInt(reader.readLine());
		
		
		c = a+b;
		System.out.println("add :" +c);
	}

}
