/**
 * Author:Claudia Preciado
 * Date Created: 3/14/18
 * Date Modified: 3/16/18
 * Desc: This program will prompt the user to enter three integers.
 * It will then display the integers by increasing order.
 */

import java.util.Scanner;

public class IncreasingOrderInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter three nonnegative integers separated by spaces or enter key:");
		Scanner scan = new Scanner(System.in);
		int int1, int2, int3;
		int1 = scan.nextInt();
		int2 = scan.nextInt();
		int3 = scan.nextInt();
		if (int1<0 || int2<0 || int3<0) {
			System.out.println("One of the numbers you entered is invalid.");
			System.out.println("Try again.");
			System.exit(0);
		}
		if (int1>int2 && int1>int3) {
			if(int2>int3) {
				System.out.println("Your numbers in ascending order are:");
				System.out.println(int3 + " " + int2 + " " + int1);
			}
			else {
				System.out.println("Your numbers in ascending order are:");
				System.out.println(int2 + " " + int3 + " " + int1);
			}
		}
		else if (int2>int1 && int2 >int3) {
			if (int1 > int3){
				System.out.println("Your numbers in ascending order are:");
				System.out.println(int3 + " " + int1 + " " + int2);
			}
			else {
				System.out.println("Your numbers in ascending order are:");
				System.out.println(int1 + " " + int3 + " " + int2);
			}
		}
		else if (int3>int1 && int3>int2) {
			if (int2>int1) {
				System.out.println("Your numbers in ascending order are:");
				System.out.println(int1 + " " + int2 + " " + int3);
			}
			else {
				System.out.println("Your numbers in ascending order are:");
				System.out.println(int2 + " " + int1 + " " + int3);
			}
		}

	}

}
