//Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index
package arrayList;
import java.util.*;

public class arrayList1b5 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));

        System.out.println("Original Colors: " + colors);

        int n = 2; // index of 3rd element

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing 3rd element: " + colors);
        } else {
            System.out.println("Invalid index to remove.");
        }
    }
}


