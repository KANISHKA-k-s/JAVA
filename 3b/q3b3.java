//Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().
package JAVA;
public class q3b3 {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Java";
        System.out.println("Reversed: " + reverseString(input));
    }


}
