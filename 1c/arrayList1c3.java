//Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))
package arrayList;
import java.util.*;

public class arrayList1c3 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        list.offerLast("Pink");

        System.out.println("After inserting at end: " + list);
    }

}
