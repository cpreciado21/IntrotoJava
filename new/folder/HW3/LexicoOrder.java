/**
 * Author:Claudia Preciado
 * Date Created: 3/17/18
 * Date Modified: 3/17/18
 * Desc: This program will prompt the user to enter three words.
 * It will then arrange them lexicographically and return the second word.
 */

import java.util.Scanner;

public class LexicoOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will take three words that you input,");
		System.out.println("arrange them alphabetically, and return the second in");
		System.out.println("the new arrangment.");
		System.out.println();
		
		System.out.println("Please enter your first word:");
		String firstWord = scan.nextLine();
		
		System.out.println("Please enter your second word:");
		String secondWord = scan.nextLine();
		
		System.out.println("Please enter your last word:");
		String lastWord = scan.nextLine();
		
		/*compare to returns a value < 0 if specific string is greater
		lexicographically, > 0 if it's less than, == 0 if it's equal
		therefore the second in the list should be in between
		*/
		
		if ((firstWord.compareTo(secondWord) > 0 && firstWord.compareTo(lastWord) < 0 ) 
				|| (firstWord.compareTo(lastWord) > 0 && firstWord.compareTo(secondWord) < 0)) {
			
			System.out.println("The second word in lexicographical order is: " + firstWord);
		}
		if ((secondWord.compareTo(firstWord) > 0 && secondWord.compareTo(lastWord) < 0) 
				|| (secondWord.compareTo(lastWord) > 0 && secondWord.compareTo(firstWord) < 0)) {
			
			System.out.println("The second word in lexicographical order is: " + secondWord);
		}
		if ((lastWord.compareTo(firstWord) > 0 && lastWord.compareTo(secondWord) < 0) 
				|| (lastWord.compareTo(secondWord) > 0 && lastWord.compareTo(firstWord) < 0)) {
			
			System.out.println("The second word in lexicographical order is: " + lastWord);
		}
	}
}