/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    //main
    public static void main(String[] args) {
        Application app = new Application();

        //get file input
        String input = app.readFile();

        //send to word counter
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords(input);

        //print word count
        wordCounter.printWordCounts();
    }



    //readFile
    public String readFile() {
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
