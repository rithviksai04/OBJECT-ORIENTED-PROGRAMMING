package operators;
import java.util.Scanner;

public class Shift {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        System.out.println("\n--- Shift Operations ---");
	        System.out.println("Left shift by 2 (num << 2): " + (num << 2));
	        System.out.println("Right shift by 2 (num >> 2): " + (num >> 2));

	        sc.close();
	    }
	}

