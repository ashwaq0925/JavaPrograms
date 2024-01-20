package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string:");
		
		String str = sc.nextLine();
		
		System.out.println("enter a string:");
		
		String str2 = sc.nextLine();
		
		String s = "";	
		
		boolean result;
		if(str.length() == str2.length());{
		
		char[] charArray = str.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		result = Arrays.equals(charArray, charArray2);
		if (result == true) {
			System.out.println("string is anagram: ");
			
		} else {
			System.out.println("string is not anagram");
		}
		
		
		}

	}

}
