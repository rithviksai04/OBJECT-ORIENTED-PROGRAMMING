package wrapperclasses;

public class Autounboxing {
	    public static void doAutoUnboxing() {
	        Integer boxedNum = 400; // Auto-boxing
	        int num = boxedNum;     // Auto-unboxing

	        System.out.println("Boxed Integer: " + boxedNum);
	        System.out.println("Auto-unboxed int: " + num);
	    }

	    public static void main(String[] args) {
	        doAutoUnboxing();
	    }
	}