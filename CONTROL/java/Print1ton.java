package CONTROL.java;
import java.util.Scanner;
public class Print1ton {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of N: ");
	        int n = sc.nextInt();

	        System.out.println("Numbers from 1 to " + n + ":");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }

	        sc.close();
	    }
	}

