package ARRAYS.java;

public class StaticValues {

	    // These are static variables, their values are shared by all instances of the class.
	    public static final String GREETING = "Hello";
	    public static final int MAX_VALUE = 100;
	    public static final double PI = 3.14159;

	    public static void main(String[] args) {
	        // You can access static variables directly using the class name.
	        System.out.println("The value of GREETING is: " + StaticValues.GREETING);
	        System.out.println("The value of MAX_VALUE is: " + StaticValues.MAX_VALUE);
	        System.out.println("The value of PI is: " + StaticValues.PI);

	        // You can also access them from an instance, but it's not the recommended practice.
	        StaticValues sv = new StaticValues();
	        System.out.println("\nAccessing static variables from an instance:");
	        System.out.println("GREETING: " + sv.GREETING);
	        System.out.println("MAX_VALUE: " + sv.MAX_VALUE);
	        System.out.println("PI: " + sv.PI);
	    }
	}
