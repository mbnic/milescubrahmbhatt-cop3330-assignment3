package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    //main
    public static void main(String[] args) {
        //get file input
        String input = readFile();

        //send to word counter
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords(input);

        //print word count
        wordCounter.printWordCounts();
    }



    //readFile
    public static String readFile() {
        String input = "";
        Path filename = Paths.get("src/main/java/ex46/exercise46_input.txt");

        try {
            input = Files.readString(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

}
