/**
 * Author:Claudia Preciado
 * Date Created: 3/16/18
 * Date Modified: 3/16/18
 * Desc: This program will prompt the user to enter a sentence.
 * It will then return a specific response depending on the punctuation
 * or number of characters.
 */

import java.util.Scanner;

public class ReadSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will read a sentence and give you "
				+ "a response depending on your input.");
		System.out.println();
		
		System.out.println("Please enter a one-line sentence with punctuation.");
		String sentence = scan.nextLine();
		
		int sentLength = sentence.length();
		String punctuation = sentence.substring(sentLength-1, sentLength); 
		//creates substring for last character in sentence
		
		if (punctuation.equals("?")) {
			if (sentLength%2 == 0) { 
				//checks if it's even
				System.out.println("Yes.");
			}
			else {
				System.out.println("No.");
			}
		}
		else if (punctuation.equals("!")) {
			System.out.println("Wow.");
		}
		else {
			System.out.println("You always say " + "\"" + sentence + "\"");
			//escape characters to print quotes
		}
	}

}
