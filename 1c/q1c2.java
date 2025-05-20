//Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
package JAVA;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class q1c2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Iterating in reverse:");
        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
