/**
 * Author: Claudia Preciado
 * Date Created: 2/28/18
 * Date Modified:
 * Desc: This program will change the first occurrence of the word "hate" into "love"
 */

import java.util.Scanner;
public class Q4HatetoLove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will replace the word 'hate' with the word 'love' in your text once.");
		System.out.println();
		System.out.println("Please enter a sentence that includes the word 'hate.'");
		System.out.println();
		
		String sentenceHate;
		sentenceHate = scan.nextLine();
		
		String sentenceLove = sentenceHate.replaceFirst("hate", "love");
		System.out.println();
		
		System.out.println("I have rephrased that to read "+ sentenceLove + ".");
		
	}

}
