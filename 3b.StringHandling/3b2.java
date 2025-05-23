//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()
package JAVA;
public class q3b2 {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "AIET is AIET and AIET grows.";
        String sub = "AIET";
        System.out.println("Occurrences: " + countOccurrences(main, sub));
    }


}
