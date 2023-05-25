import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCount {
    public static void main(String[] args) {
        String filename = "input.txt";
        int wordCnt = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            
            String line;
            while((line = reader.readLine()) != null){
                String words[] = line.split("\\s+");
                wordCnt += words.length;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println(wordCnt);
    }
}
