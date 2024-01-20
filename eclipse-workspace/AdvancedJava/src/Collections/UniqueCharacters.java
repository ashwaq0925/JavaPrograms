package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
	
		private static void toFindUniqueCharacters(String inputSentence) {
			Set<Character> uniqueCharacter = new HashSet<Character>();
			for(int index = 0; index < inputSentence.length(); index++) {
				uniqueCharacter.add(inputSentence.charAt(index));
			}
			System.out.println(uniqueCharacter);
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the string to find unique characters...");
			String inputSentence = scan.nextLine();
			toFindUniqueCharacters(inputSentence);

		}

	}

