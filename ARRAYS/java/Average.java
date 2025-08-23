package ARRAYS.java;

import java.util.Scanner;

public class Average {
	    public static void main(String[] args) {
	        // Create a Scanner object to read user input.
	        Scanner scanner = new Scanner(System.in);
	        
	        // Define an array to hold the marks for six subjects.
	        int[] marks = new int[6];
	        String[] subjects = {"Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5", "Subject 6"};
	        int totalMarks = 0;

	        // Prompt the user to enter marks for each subject.
	        System.out.println("Enter the marks for six subjects (out of 100):");

	        for (int i = 0; i < 6; i++) {
	            System.out.print(subjects[i] + ": ");
	            marks[i] = scanner.nextInt();
	            totalMarks += marks[i];
	        }

	        // Calculate the average marks.
	        double averageMarks = (double) totalMarks / 6;

	        // Print the results.
	        System.out.println("\n--- Student Marksheet ---");
	        System.out.println("Subject Marks:");
	        for (int i = 0; i < 6; i++) {
	            System.out.println(subjects[i] + ": " + marks[i]);
	        }
	        
	        System.out.println("-------------------------");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.printf("Average Marks: %.2f%%\n", averageMarks);
	        
	        // Close the scanner to prevent resource leaks.
	        scanner.close();
	    }
	}