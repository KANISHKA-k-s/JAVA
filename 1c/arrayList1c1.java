//Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package arrayList;
import java.util.*;

public class arrayList1c1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Full List: " + list);

        System.out.println("Iterating from 2nd element:");
        Iterator<String> iterator = list.listIterator(1); // Start at index 1 (2nd element)
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
