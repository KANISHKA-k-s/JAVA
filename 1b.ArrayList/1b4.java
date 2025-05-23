//Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()
package arrayList;
import java.util.*;

public class arrayList1b4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Original List: " + colors);

        List<String> subList = colors.subList(0, 2); // index 0 and 1 (1st and 2nd)

        System.out.println("Extracted Sublist (1st and 2nd): " + subList);
    }
}



