//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()
package JAVA;
public class q3c2 {
    public static String truncate(String input, int length) {
        if (input.length() <= length) return input;
        return input.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String text = "This is a long sentence that needs to be shortened.";
        System.out.println("Truncated: " + truncate(text, 20));
    }


}
