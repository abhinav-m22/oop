import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

    public static HashMap<String, Integer>  countWords(String input){
        String words[] = input.split(" ");
        HashMap<String, Integer>  mp= new HashMap<>();

        for(String word: words){
            if(mp.containsKey(word)){
                int cnt = mp.get(word);
                mp.put(word, cnt+1);
            }
            else{ 
                mp.put(word, 1);
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<String, Integer> mp = countWords(input);

        System.out.println(mp);

        scanner.close();

    }

}
