//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()
package JAVA;
public class q3c1 {
    public static String capitalizeWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String text = "hello world from java";
        System.out.println("Capitalized: " + capitalizeWords(text));
    }

}
