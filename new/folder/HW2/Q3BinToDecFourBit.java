/**
 * Author: Claudia Preciado
 * Date Created:
 * Date Modified:
 * Desc: This program will take a 4-bit binary number as a string
 * and convert it to its decimal equivalent without using loops
 */

import java.util.Scanner;
public class Q3BinToDecFourBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will convert your 4-bit binary number into a decimal number.");
		System.out.println();
		
		String initialBin;
		System.out.println("Please enter a 4-bit binary number (only 1's and 0's):");
		initialBin = scan.next();
		String stringb0 = initialBin.substring(0,1);
		String stringb1 = initialBin.substring(1,2);
		String stringb2 = initialBin.substring(2,3);
		String stringb3 = initialBin.substring(3,4);
		
		int binIndex3 = Integer.parseInt(stringb3);
		int binIndex2 = Integer.parseInt(stringb2);
		int binIndex1 = Integer.parseInt(stringb1);
		int binIndex0 = Integer.parseInt(stringb0);
		
		int decimal = (8*binIndex0)+(4*binIndex1)+(2*binIndex2)+(1*binIndex3);
		
		System.out.println("The decimal equivalent of " + initialBin + " is " + decimal + ".");
		
		
		

	}

}
