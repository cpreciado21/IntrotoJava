/*
 * Claudia Preciado CMP167 HW1
 */
import java.util.Scanner; //importing Scanner
public class Q3Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will calculate the product of three numbers.");
		Scanner scan = new Scanner(System.in); //creating object
		System.out.println("Enter a number:");
		int x = scan.nextInt();                //storing the value in int x
		System.out.println("Enter another number:");
		int y = scan.nextInt();                //storing value in y
		System.out.println("Enter a third number:");
		int z = scan.nextInt();                //storing value in z
		int total = x * y * z;                 //calculating the product of the three
		System.out.println("The product of your three numbers is: " + total);
		
	}

}
