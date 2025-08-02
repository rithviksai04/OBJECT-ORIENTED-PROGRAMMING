package CONTROL.java;
import java.util.Scanner;

public class Acceptnumber {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        System.out.println("Enter numbers (0 to stop):");
	        do {
	            num = sc.nextInt();
	            if (num != 0) {
	                System.out.println("You entered: " + num);
	            }
	        } while (num != 0);

	        System.out.println("Stopped input.");
	        sc.close();
	    }
	}

