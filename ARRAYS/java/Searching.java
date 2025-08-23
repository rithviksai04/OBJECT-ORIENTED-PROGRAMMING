package ARRAYS.java;

import java.util.Scanner;
import java.util.Arrays;

public class Searching {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = {10, 25, 42, 8, 55, 31, 19, 70};
	        boolean found = false;
	        int position = -1;

	        System.out.println("Given elements: " + Arrays.toString(numbers));
	        System.out.print("Enter the element you want to search for: ");
	        int searchElement = scanner.nextInt();

	        // Perform a linear search.
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == searchElement) {
	                found = true;
	                position = i;
	                break; // Exit the loop once the element is found.
	            }
	        }

	        // Print the result.
	        if (found) {
	            System.out.println("Element " + searchElement + " was found at index " + position + ".");
	        } else {
	            System.out.println("Element " + searchElement + " was not found in the list.");
	        }

	        scanner.close();
	    }
	}