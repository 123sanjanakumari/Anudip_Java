
import java.util.*;

public class Collection_part1 {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");

        // 1. Write A program to traverse (or iterate) ArrayList
        System.out.println("Iterating using a for loop:");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i));
        }

        // 2. Write A program to find the length of the ArrayList
        int lengthOfArrayList = languages.size();

        System.out.println("The length of the ArrayList is: " + lengthOfArrayList);

        // 3. Given an element write a program to check if element(value) exists in
        // ArrayList

        String targetElement = "c";
        boolean isFound = languages.contains(targetElement);
        System.out.println("Using contains(): " + isFound);

        // 4. Write A program to find the length of the ArrayList
        int lengthOfArrayList2 = languages.size();
        System.out.println("The length of the ArrayList is: " + lengthOfArrayList2);

        // 5. Write A program to sort ArrayList in descending order
        Collections.sort(languages, Collections.reverseOrder());
        System.out.println("Sorted ArrayList in descending order:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // 6. Write A program to remove element from specified index of ArrayList
        int removeIndex = 2;
        languages.remove(removeIndex);
        System.out.println("Updated ArrayList:");
        for (String language : languages) {
            System.out.println(language);
        }

    }
}
