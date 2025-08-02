package operators;

import java.util.Scanner;

public class Gates {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.println("\n--- Bitwise Operations ---");
	        System.out.println("Bitwise AND (a & b): " + (a & b));
	        System.out.println("Bitwise OR (a | b): " + (a | b));
	        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b));
	        System.out.println("Bitwise Complement (~a): " + (~a));

	        sc.close();
	    }
	}


