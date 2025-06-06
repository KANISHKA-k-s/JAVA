//Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()
package JAVA;
import java.util.Random;

public class q3c4 {
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random String: " + generateRandomString(10));
    }

}
