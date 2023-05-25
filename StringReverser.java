import java.util.Scanner;

public class StringReverser {
    private String inputString;

    public StringReverser(String inputString) {
        this.inputString = inputString;
    }

    public String reverseString() {
        char[] characters = inputString.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return new String(characters);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringReverser reverser = new StringReverser(inputString);
        String reversedString = reverser.reverseString();

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
