/**
 * Author:Claudia Preciado
 * Date Created: 3/14/18
 * Date Modified: 3/16/18
 * Desc: This program will prompt the user to enter two numbers.
 * It will then check if the first number is perfectly divisible 
 * by the second.
 */

import java.util.Scanner;

public class IsItDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will check if one number is divisble by the other.");
		System.out.println();
		System.out.println("The first number you enter will be the one tested for divisibility.");
		System.out.println("Enter two numbers:");
		
		Scanner scan = new Scanner(System.in);
		
		int firstNum, secondNum;
		firstNum = scan.nextInt();
		secondNum = scan.nextInt();
		System.out.println();
		
		int answer = firstNum/secondNum;
		
		if (firstNum%secondNum == 0) {
			System.out.println(firstNum + " is perfectly divisible by " 
					+ secondNum);
			System.out.println("The answer is: " + answer);
		}
		else {
			System.out.println(firstNum + " is not divisible by " 
					+ secondNum);
		}
	}

}
