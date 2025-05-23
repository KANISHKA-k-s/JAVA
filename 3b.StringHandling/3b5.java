//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()
package JAVA;
public class q3b5 {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String input = "Java   is   cool ";
        System.out.println("After removing whitespace: '" + removeWhitespace(input) + "'");
    }


}
