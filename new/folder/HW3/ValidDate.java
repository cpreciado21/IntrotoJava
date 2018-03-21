/**
 * Author:Claudia Preciado
 * Date Created: 3/16/18
 * Date Modified: 3/17/18
 * Desc: This program will prompt the user to enter a date in mm/dd/yyyy format.
 * It will then find out if it is a valid calendar date.
 */

import java.util.Scanner;

public class ValidDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("THis program will check whether the date you enter"
				+ "is a valid calendar date");
		System.out.println()
		;
		System.out.println("Please enter a date in mm/dd/yyyy format.");

		// initialize the string delimiter
		scan.useDelimiter("[/\\s]"); 
		//makes the delimiter either a / or whitespace

		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		System.out.println();
		
		boolean m = false;
		boolean d = false;
		boolean y = false;
		//default to false
		

		if (month >=1 && month <=12) {
			m = true;
		}
		else {
			m = false;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month ==8 
				|| month == 10 || month ==12) {
		//establishing months that have 31 days
			
			if (day <=31 && day >=1) {
				if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
				//math behind a leap year
					m = true;
					d = true;
					y = true;
				}
				else if (year>=0) {
					m = true;
					d = true;
					y = true;
				}
			}
			else {
				m = false;
				d = false;
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day <=30 && day >=1) {
			//establishing months with 30 days
				
				if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
					m = true;
					d = true;
					y = true;
				}
				else if (year>=0) {
					m = true;
					d = true;
					y = true;
				}
			}
			else {
				m = false;
				d = false;
			}
		}
		if (month ==2) {
			if (year%4 == 0 && year%400 == 0) {
				if (day <=29 && day >=1) {
					m = true;
					d = true;
					y = true;
				}
				else {
					m = false;
					d = false;
					y = false;
				}
			}
			else if (year%4 == 0 && year%100 != 0)
			{
				if (day <=29 && day>=1) {
					m = true;
					d = true;
					y = true;
				}
				else {
					m = false;
					d = false;
					y = false;
				}
			}
			else if (year>=0 && day>=1 && day<=28) {
				m = true;
				d = true;
				y = true;
			}
		}
		else {
			y = true;
		}
		if  (m == true && d == true && y == true) {
			System.out.println(month + "/" + day + "/" + year + " is a valid date.");
		}
		else if (m == false && d == true && y == true) {
			System.out.println("Your month is invalid.");
		}
		else if (m == true && d == false && y == true) {
			System.out.println("Your date is invalid.");
		}
		else if (m== true && d == true && y == false) {
			System.out.println("Your year is invalid.");
		}
		else if (m == false && d == false && y == true) {
			System.out.println("Your month and date are invalid.");
		}
		else if (m == false && d == true && y == false) {
			System.out.println("Your month and year are invalid.");
		}
		else if (m == true && d == false && y == false) {
			System.out.println("Your date and year are invalid.");
		}
		else if (m == false && d == false && y == false) {
			System.out.println("Everything is invalid. Please try again.");
		}
	}
}
