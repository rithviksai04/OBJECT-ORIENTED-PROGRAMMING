package ARRAYS.java;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElements {

	    public static void main(String[] args) {
	        // Create a list with duplicate elements.
	        List<String> listWithDuplicates = new ArrayList<>();
	        listWithDuplicates.add("apple");
	        listWithDuplicates.add("banana");
	        listWithDuplicates.add("apple");
	        listWithDuplicates.add("orange");
	        listWithDuplicates.add("banana");
	        listWithDuplicates.add("pineapple");
	        listWithDuplicates.add("watermelon");
	        listWithDuplicates.add("pineapple");
	        listWithDuplicates.add("watermelon");

	        
	        System.out.println("Original List: " + listWithDuplicates);

	        // Convert the List to a HashSet to remove duplicates.
	        Set<String> uniqueElements = new HashSet<>(listWithDuplicates);

	        // Print the unique elements from the Set.
	        System.out.println("Unique Elements: " + uniqueElements);
	    }
	}
