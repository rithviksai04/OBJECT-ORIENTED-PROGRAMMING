package CONTROL.java;
import java.util.Scanner;

public class Checkpositive {


	public class CheckPositive {
	
	}
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num > 0) {
	            System.out.println("The number is positive.");
	        } else if (num == 0) {
	            System.out.println("The number is zero.");
	        } else {
	            System.out.println("The number is negative.");
	        }

	        sc.close();
	    }
	}



