//Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
package arrayList;


	import java.util.*;

	public class arrayList1b3 {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Blue", "Green", "Red"));

	        System.out.println("Before sorting: " + colors);

	        Collections.sort(colors);

	        System.out.println("After sorting: " + colors);
	    }
	}

