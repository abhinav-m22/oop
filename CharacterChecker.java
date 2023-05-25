import java.util.*;

class CharacterChecker{
    private String s;

    public CharacterChecker(String s){
        this.s = s;
    }

    public boolean containsCharacter(char character){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == character) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to check: ");
        char character = scanner.next().charAt(0);

        CharacterChecker checker = new CharacterChecker(inputString);
        boolean containsCharacter = checker.containsCharacter(character);

        System.out.println("The string contains character '" + character + "': " + containsCharacter);


    }
}