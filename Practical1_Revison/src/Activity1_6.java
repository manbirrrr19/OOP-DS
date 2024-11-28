import java.util.ArrayList;
import java.util.Scanner;

public class Activity1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read a long text message
        System.out.println("Enter a long text message:");
        String text = scanner.nextLine();

        // 2. Find and display the first occurrence of "Apollo 13"
        int firstIndex = findFirstOccurrence(text, "Apollo 13");
        if (firstIndex != -1) {
            System.out.println("First occurrence of 'Apollo 13': " + firstIndex);
        } else {
            System.out.println("'Apollo 13' not found.");
        }

        // 3. Display all indices of "Apollo 13"
        displayAllOccurrences(text, "Apollo 13");
    }

    // Method to find the first occurrence of a phrase
    public static int findFirstOccurrence(String text, String phrase) {
        return text.indexOf(phrase);
    }

    // Method to find and display all occurrences of a phrase
    public static void displayAllOccurrences(String text, String phrase) {
        ArrayList<Integer> indices = new ArrayList<>();
        int index = text.indexOf(phrase);

        while (index != -1) {
            indices.add(index);
            index = text.indexOf(phrase, index + 1); // Look for the next occurrence
        }

        if (indices.isEmpty()) {
            System.out.println("Not found");
        } else {
            System.out.println("All occurrences of 'Apollo 13' at indices: " + indices);
        }
    }
}
