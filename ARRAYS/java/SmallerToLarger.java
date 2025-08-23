package ARRAYS.java;

import java.util.Scanner;

public class SmallerToLarger {

	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Get the number of elements from the user
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();

	        // Create an array to store the elements
	        int[] numbers = new int[size];

	        // Prompt the user to enter the elements
	        System.out.println("Enter " + size + " integers:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Check if the array is empty
	        if (size == 0) {
	            System.out.println("The array is empty. Cannot find smallest and largest elements.");
	            scanner.close();
	            return;
	        }

	        // Initialize smallest and largest with the first element of the array
	        int smallest = numbers[0];
	        int largest = numbers[0];

	        // Loop through the rest of the array to find the smallest and largest
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i]; // Update smallest if a smaller element is found
	            }
	            if (numbers[i] > largest) {
	                largest = numbers[i]; // Update largest if a larger element is found
	            }
	        }

	        // Display the results
	        System.out.println("\n--- Results ---");
	        System.out.println("The smallest element is: " + smallest);
	        System.out.println("The largest element is: " + largest);

	        // Close the scanner
	        scanner.close();
	    }
}

