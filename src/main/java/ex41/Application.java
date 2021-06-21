/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex41;

import java.io.File;
import java.util.Scanner;


public class Application {
    public static void main (String[] args) {
        Application app = new Application();
        Roster roster = new Roster();
        app.readFile(roster);
        String output = roster.getSortedOutput();
        System.out.println(output);
    }


    //read a file and send names to roster
    public void readFile(Roster roster) {
       Scanner in;

       try {
           in = new Scanner(new File("src/main/java/ex41/exercise41_input.txt"));

           while(in.hasNext()) {
               roster.addToRoster(in.nextLine());
           }

           in.close();
       } catch (Exception ex) {
           return;
       }
    }
}
