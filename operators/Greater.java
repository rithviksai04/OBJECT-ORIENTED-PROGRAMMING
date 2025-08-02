package operators;
import java.util.Scanner;
public class Greater {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Greater number is: " + max);

        sc.close();
    }
}

