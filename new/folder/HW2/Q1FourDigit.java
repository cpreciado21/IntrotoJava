/**
 * Author:Claudia Preciado
 * Date Created: 2/26/18
 * Date Modified: 2/28/18
 * Desc: This program will prompt the user to enter a four digit integer.
 * It will then separate the integer line by line.
 */
import java.util.Scanner; //importing Scanner
public class Q1FourDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will take an four digit input and print it out one digit per line.");
		System.out.println();
		System.out.println("Please enter a four digit integer.");
		
		int n1;
        n1 = scan.nextInt( );
        System.out.println();
        System.out.println("You entered:");
        
        int thousand, hundred, ten, one;
        thousand = n1/1000;
        hundred = (n1%1000)/100;
        ten = (n1%100)/10;
        one = (n1%10);
        
        System.out.println(thousand);
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(one);
        

	}

}
