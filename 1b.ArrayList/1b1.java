//1. Write a java program for getting different colors through ArrayList interface and search whether
	//the color "Red" is available or not?
package arrayList;
import java.util.*;

public class arrayList1b1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Colors: " + colors);

        if (colors.contains("Red")) {
            System.out.println("Color 'Red' is available in the list.");
        } else {
            System.out.println("Color 'Red' is NOT available in the list.");
        }
    }
}
