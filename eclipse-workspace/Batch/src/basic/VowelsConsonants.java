package basic;
import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string:");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
	    int vowels = 0, consonants = 0;

	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i) {
	      char ch = line.charAt(i);

	      
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	        ++vowels;
	      }

	     
	      else if ((ch >= 'a' || ch <= 'z'  || ch>='A'   || ch<='Z') ) {
	        ++consonants;
	      }
	      
	    }

	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);

	
		      
		      
		  
		    }

		    

	}



