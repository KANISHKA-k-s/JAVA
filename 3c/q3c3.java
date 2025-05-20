//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()
package JAVA;
public class q3c3 {
    public static boolean isNumeric(String input) {
        return input != null && input.matches("\\d+");
    }

    public static void main(String[] args) {
        String str1 = "123456";
        String str2 = "123a56";
        System.out.println(str1 + " is numeric? " + isNumeric(str1));
        System.out.println(str2 + " is numeric? " + isNumeric(str2));
    }


}
