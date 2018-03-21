/**
 * @author claudiapreciado
 * Date Created: 2/28/17
 * Date Modified:
 * Desc: Converts Fahrenheit (int) to Celsius (double)
 *
 */

import java.util.Scanner;
public class Q2FahtoCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will convert Fahrenheit to Celsius.");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your temperature in Fahrenheit:");
		
		int fah;
		fah = scan.nextInt(); //takes it in as an integer
		
		double cel = 5*(fah-32)/9; //celsius in double to account for decimal
		System.out.println(fah + "F is " + cel + " in Celsius.");	 

	}
}
