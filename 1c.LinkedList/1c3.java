//Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))

package JAVA;
import java.util.Arrays;
import java.util.LinkedList;

public class q1c3 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        list.offerLast("Pink");

        System.out.println("After inserting at end: " + list);
    }

}
