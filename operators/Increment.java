package operators;
import java.util.Scanner;
public class Increment {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("\n--- Increment and Decrement ---");
        System.out.println("Original: " + x);
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("After post-increment: " + x);
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Post-decrement (x--): " + (x--));
        System.out.println("After post-decrement: " + x);
        System.out.println("Pre-decrement (--x): " + (--x));

        sc.close();
    }
}
