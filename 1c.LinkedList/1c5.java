//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))
package JAVA;

	import java.util.*;

	public class q1c5 {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        System.out.println("Before swapping: " + list);

	        // Swap 1st (index 0) and 3rd (index 2)
	        Collections.swap(list, 0, 2);

	        System.out.println("After swapping 1st and 3rd elements: " + list);
	    }
	}

