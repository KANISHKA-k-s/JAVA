/* 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list  */


import java.util.*;

public class arrayList{

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Operations ===");
        performAllOperations(arrayList);

        System.out.println("\n=== LinkedList Operations ===");
        performAllOperations(linkedList);
    }

    static void performAllOperations(List<String> list) {
        // 1. Adding elements
        addElements(list);

        // 2. Adding element at specific index
        addElementAtIndex(list, 1, "Mango");

        // 3. Adding multiple elements
        addMultipleElements(list, Arrays.asList("Pineapple", "Grapes"));

        // 4. Accessing elements
        accessElement(list, 2);

        // 5. Updating elements
        updateElement(list, 0, "Green Apple");

        // 6. Removing elements
        removeElement(list, "Banana");

        // 7. Searching elements
        searchElement(list, "Orange");

        // 8. List size
        printSize(list);

        // 9. Iterating over list (for-each)
        iterateList(list);

        // 10. Using Iterator
        iterateUsingIterator(list);

        // 11. Sorting
        sortList(list);

        // 12. Sublist
        subListExample(list, 0, 2);

        // 13. Clearing the list
        clearList(list);
    }

    static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

    static void addElementAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
        System.out.println("After adding element at index " + index + ": " + list);
    }

    static void addMultipleElements(List<String> list, List<String> elements) {
        list.addAll(elements);
        System.out.println("After adding multiple elements: " + list);
    }

    static void accessElement(List<String> list, int index) {
        System.out.println("Element at index " + index + ": " + list.get(index));
    }

    static void updateElement(List<String> list, int index, String newElement) {
        list.set(index, newElement);
        System.out.println("After updating element at index " + index + ": " + list);
    }

    static void removeElement(List<String> list, String element) {
        list.remove(element);
        System.out.println("After removing '" + element + "': " + list);
    }

    static void searchElement(List<String> list, String element) {
        boolean found = list.contains(element);
        System.out.println("Is '" + element + "' in list? " + found);
    }

    static void printSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    static void iterateList(List<String> list) {
        System.out.print("Iterating using for-each: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    static void iterateUsingIterator(List<String> list) {
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    static void subListExample(List<String> list, int fromIndex, int toIndex) {
        if (toIndex <= list.size()) {
            List<String> subList = list.subList(fromIndex, toIndex);
            System.out.println("Sublist from index " + fromIndex + " to " + toIndex + ": " + subList);
        } else {
            System.out.println("Invalid sublist range.");
        }
    }

    static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}





