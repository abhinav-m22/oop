import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    private static void sortStrings(String[] strings) {
        Arrays.sort(strings);
    }

    private static String combineStrings(String str1, String str2) {
        StringBuilder combined = new StringBuilder(str1);
        combined.append(str2);
        return combined.toString();
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[10];

        // Read 10 strings from console
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the strings in ascending order
        sortStrings(strings);

        // Print the sorted strings
        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        String combinedString = combineStrings(strings[0], strings[1]);
        System.out.println("\nCombined string: " + combinedString);

        // Reverse the first string and display it
        String reversedString = reverseString(strings[0]);
        System.out.println("Reversed first string: " + reversedString);

        scanner.close();
    }

}
