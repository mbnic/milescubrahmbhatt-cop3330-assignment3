/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex42;

import java.util.ArrayList;
import java.util.List;

public class Records {

    //our list of workers
    private List<Worker> workers = new ArrayList<>();

    //create a new worker and add to list of workers
    public void addToRecords(String info) {
        Worker w = new Worker();

        //convert string to char array
        char[] infoArray = info.toCharArray();
        char comma = ',';

        //to keep track of commas
        int afterLastComma = 0;

        //store split sections of char array into string array
        int k = 0;
        String[] newRecordInfo = new String[3];

        //split without using parser
        for (int i = 0; i < info.length(); i++) {
            if (infoArray[i] == comma){
                 newRecordInfo[k] = info.substring(afterLastComma, i);
                 k++;
                 afterLastComma = i + 1;
            }

            //for the last section of the file line
            if (i == info.length() - 1)
                newRecordInfo[k] = info.substring(afterLastComma, i + 1);
        }

        //user the worker setters
        w.setLastname(newRecordInfo[0]);
        w.setFirstname(newRecordInfo[1]);
        w.setSalary(Integer.parseInt(newRecordInfo[2]));


        //add worker to list
        workers.add(w);
    }


    //print out list in a evenly spaced table
    public void outputRecordTable() {
        System.out.printf("%-10s %-10s %-8s\n", "Last", "First", "Salary");

        for (int i = 0; i < 28; i++)
            System.out.print("-");

        for (Worker work: workers)
            System.out.printf("\n%-10s %-10s %-8d", work.getLastname(), work.getFirstname(), work.getSalary());
    }
}
