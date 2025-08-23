package ARRAYS.java;
import java.util.Scanner;
import java.util.Arrays;

public class Console {
	
	    public static void main(String[] args) {
	        // Create a Scanner object to read from the console.
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input.
	        System.out.println("Enter a list of elements separated by spaces:");

	        // Read the entire line of input.
	        String inputLine = scanner.nextLine();

	        // Split the input string into an array of strings using a space as the delimiter.
	        String[] elements = inputLine.split(" ");

	        // Print the elements to the console.
	        System.out.println("\nElements you entered:");
	        for (String element : elements) {
	            System.out.println(element);
	        }

	        // Alternatively, use Arrays.toString() for a quick print.
	        System.out.println("\nElements as an array: " + Arrays.toString(elements));

	        // Close the scanner to free up resources.
	        scanner.close();
	    }
	}
