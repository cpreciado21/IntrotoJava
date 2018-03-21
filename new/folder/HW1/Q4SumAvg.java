/*
 * Claudia Preciado CMP167 HW1
 */
import java.util.Scanner; //importing Scanner
public class Q4SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will calculate the sum and average of four numbers.");
		Scanner scan = new Scanner(System.in); //creating object
		System.out.println("Enter 1st number (only whole numbers):");
		int a = scan.nextInt();                //storing the value in int a
		System.out.println("Enter 2nd number (only whole numbers):");
		int b = scan.nextInt();                //storing the value in int b
		System.out.println("Enter 3rd number (only whole numbers):");
		int c = scan.nextInt();                //storing the value in int c
		System.out.println("Enter 4th number (only whole numbers):");
		int d = scan.nextInt();                //storing the value in int d
		int sum = a + b + c + d;               //sum of the 4
		double average = sum/4.0;              //making the avg double bc it might contain fractions
		System.out.println("The sum of your four numbers is: " + sum);
		System.out.println("The average of your four numbers is: " + average);

	}

}
