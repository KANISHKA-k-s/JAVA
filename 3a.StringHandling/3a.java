//3a. Develop a java program for performing various string operations with different string
//handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()
package JAVA;
public class q3a {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "Hello";
        System.out.println("str1 equals str3? " + str1.equals(str3)); // true
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // Negative if str1 < str2

        // 4. String Searching
        String sentence = "Welcome to Java Programming!";
        System.out.println("Sentence contains 'Java'? " + sentence.contains("Java"));
        System.out.println("Index of 'Java': " + sentence.indexOf("Java"));

        // 5. Substring Operations
        System.out.println("Substring from index 11: " + sentence.substring(11));
        System.out.println("Substring from index 11 to 15: " + sentence.substring(11, 15));

        // 6. String Modification
        String modified = sentence.replace("Java", "Python");
        System.out.println("After replace: " + modified);

        // 7. Whitespace Handling
        String withSpaces = "   Trim this string   ";
        System.out.println("Before trim: '" + withSpaces + "'");
        System.out.println("After trim: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String full = str1 + " " + str2;
        System.out.println("Concatenated String: " + full);

        // 9. String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("Splitted Colors:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" - Dept of CSE");
        sb.append(" - JAVA Lab");
        System.out.println("StringBuilder Result: " + sb.toString());

        // 11. String Formatting
        String name = "Kanishka";
        int age = 21;
        String formatted = String.format("Name: %s | Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email
        String email = "kanishka@example.com";
        boolean isValidEmail = email.contains("@") && email.startsWith("kanishka") && email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is email valid? " + isValidEmail);
    }

}
