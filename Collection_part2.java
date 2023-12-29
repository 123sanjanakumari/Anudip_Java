import java.util.HashMap;
import java.util.Scanner;

class Collection_part2 {
    public static void main(String[] args) {
        // Student Id
        String[] Id = { "101", "102", "103" };
        // Student Marks
        double[] Marks = { 300.7, 350, 330.5 };

        HashMap m = new HashMap<>();
        for (int i = 0; i < Id.length; i++) {
            m.put(Id[i], Marks[i]);
        }
        System.out.println(m); // Printing Entry
        System.out.println(m.size());// Printing Size of HashMap

    }
}