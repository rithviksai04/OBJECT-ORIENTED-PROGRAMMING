package wrapperclasses;

public class Autoboxing {
	    public static void doAutoBoxing() {
	        int num = 300;
	        Integer autoBoxed = num;

	        System.out.println("Primitive int: " + num);
	        System.out.println("Auto-boxed Integer: " + autoBoxed);
	    }

	    public static void main(String[] args) {
	        doAutoBoxing();
	    }
	}
