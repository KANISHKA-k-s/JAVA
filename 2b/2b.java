package JAVA;
public class q2b {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // Testing StringBuffer
        StringBuffer buffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            buffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Testing StringBuilder
        StringBuilder builder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            builder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output Results
        System.out.println("Time taken by StringBuffer (in nanoseconds): " + durationBuffer);
        System.out.println("Time taken by StringBuilder (in nanoseconds): " + durationBuilder);

        // Justification
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster and more efficient for single-threaded operations.");
        } else {
            System.out.println("StringBuffer is slower due to thread safety (synchronized methods).");
        }
    }


}
