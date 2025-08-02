package wrapperclasses;

public class Unboxing {

	    public static void doBoxing() {
	        int num = 100;
	        Integer boxedNum = Integer.valueOf(num); // Boxing

	        System.out.println("Primitive int: " + num);
	        System.out.println("Boxed Integer: " + boxedNum);
	    }

	    public static void main(String[] args) {
	        doBoxing();
	    }
	}