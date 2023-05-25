import java.util.Scanner;

public class DupWords {
    private String inputString;

    public DupWords(String inputString) {
        this.inputString = inputString;
    }

    public int countDuplicateWords() {
        String[] words = inputString.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;
            }

            int duplicateCount = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    duplicateCount++;
                    words[j] = null;
                }
            }

            if (duplicateCount > 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        DupWords wordCounter = new DupWords(inputString);
        int duplicateCount = wordCounter.countDuplicateWords();

        System.out.println("Number of duplicate words: " + duplicateCount);
        scanner.close();
    }
}