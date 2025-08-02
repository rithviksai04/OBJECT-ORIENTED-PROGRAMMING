package operators;
import java.util.Scanner;

public class Compare {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first integer: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second integer: ");
	        int num2 = sc.nextInt();

	        System.out.println("\n--- Comparison Result ---");

	        if (num1 > num2) {
	            System.out.println(num1 + " is greater than " + num2);
	        } else if (num1 < num2) {
	            System.out.println(num2 + " is greater than " + num1);
	        } else {
	            System.out.println("Both numbers are equal.");
	        }

	        sc.close();
	    }
}
