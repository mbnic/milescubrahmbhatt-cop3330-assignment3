/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex42;

import java.io.File;
import java.util.Scanner;

public class Application {

    public static void main (String[] args) {
        Application app = new Application();
        Records records = new Records();
        app.readFile(records);
        records.outputRecordTable();
    }


    //read a file and send names to records
    public void readFile(Records records) {
        Scanner in;

        try {
            in = new Scanner(new File("src/main/java/ex42/exercise42_input.txt"));

            while(in.hasNext()) {
                records.addToRecords(in.nextLine());
            }

            in.close();
        } catch (Exception ex) {
            return;
        }
    }

}
