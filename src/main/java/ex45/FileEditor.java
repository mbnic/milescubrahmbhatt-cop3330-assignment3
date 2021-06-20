/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEditor {


    //creates new file and writes output to new file
    public void createOutputFile(String outFile, String output) {
        File f = new File("src/main/java/ex45" + "/" + outFile + ".txt");

        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //replace all instances of "utilize" and return new string
    public String replaceWord() {
        //get the input text
        String input = getInput();
        String output;

        //replace utilize
        output = input.replaceAll("utilize", "use");

        return output;
    }

    //get input string from file
    private String getInput() {
        String input = "";
        Path filename = Paths.get("src/main/java/ex45/exercise45_input.txt");

        try {
            input = Files.readString(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }


}
