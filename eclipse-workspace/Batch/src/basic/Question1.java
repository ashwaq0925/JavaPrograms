package basic;

import java.util.Scanner;

public class Question1 {
	
	public static void stringManupulation(String str) {
		int vowelCnt =0;
		int spaceCnt =0;
		
		str =str.toLowerCase();
		
		for(int i =0; i<str.length();i++) 
		{
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' ||str.charAt(i)== 'i' ||str.charAt(i)== 'o' ||str.charAt(i)== 'u' );
			{
				vowelCnt++;
			}
			if(str.charAt(i)== ' ')
			{
				spaceCnt++;
			}
		}
		
		}

	public static void main(String[] args) {
		
	}

}
