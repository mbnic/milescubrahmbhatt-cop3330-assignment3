/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex46;

import java.util.*;
import java.util.Map.Entry;

public class WordCounter {

    private Map<String, Integer> words = new HashMap<>();

    public void printWordCounts() {

        //get sorted map
        Map<String, Integer> sortedWords = sortByValue();

        //print map values
        for (String key: sortedWords.keySet()) {
            System.out.printf("%-10s %s\n", key + ":", getDots(words.get(key)));

        }
    }

    //sort the wordMap in ascending order
    private Map<String, Integer> sortByValue() {
        //make list with entries in wordMap
        List<Entry<String, Integer>> list = new LinkedList<>(words.entrySet());

        //sorts list of map values
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        //new map to return sorted map
        Map<String, Integer> sortedWords = new LinkedHashMap<>();

        //copy list into sorted map
        for (Entry<String, Integer> entry : list)
            sortedWords.put(entry.getKey(), entry.getValue());

        return sortedWords;
    }

    //get the amount of dots for the output
    private String getDots(int num) {
        return "*".repeat(Math.max(0, num));
    }

    //count total amount of each word in input file
    public void countWords(String input) {

        //split by line and then spaces to count each word in each line
        for (String line: input.split("\n")) {
            for (String word : line.split(" ")) {

                //add each word into map and update if its already in map
                if (words.containsKey(word)) {
                    words.put(word, words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            }
        }
    }


}
