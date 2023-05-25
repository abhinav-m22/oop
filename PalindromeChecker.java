import java.util.Scanner;

public class PalindromeChecker {
    private String inputString;

    public PalindromeChecker(String inputString) {
        this.inputString = inputString;
    }

    public boolean isPalindrome() {
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(inputString);
        boolean isPalindrome = checker.isPalindrome();

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
