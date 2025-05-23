//2. Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList
package arrayList;

	import java.util.*;

	public class arrayList1b2 {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));

	        System.out.println("Original Colors: " + colors);

	        // Remove 2nd element (index 1)
	        colors.remove(1);

	        // Remove "Blue"
	        colors.remove("Blue");

	        System.out.println("After removal: " + colors);
	    }
	}


