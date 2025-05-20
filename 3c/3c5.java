//Q10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()
package JAVA;
public class q3c5 {
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) return 0;
        return input.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String text = "Java is a popular programming language";
        System.out.println("Word Count: " + countWords(text));
    }

}
