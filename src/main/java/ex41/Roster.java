/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex41;
import java.util.*;

public class Roster {
    //our list of people
    private List<Person> people = new ArrayList<>();

    //create a new person and add to list people
    public void addToRoster(String name) {
        Person p = new Person();
        String s[] = name.split(" ");
        p.setLastName(s[0]);
        p.setFirstName(s[1]);

        people.add(p);
    }

    //sortRoster
    // will sort the names alphabetically
    private void sortRoster() {

        //sort names using comparator
        Comparator<Person> nameCompareator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getLastName().compareToIgnoreCase(o2.getLastName()) > 0)
                    return 1;

                else if (o1.getLastName().compareToIgnoreCase(o2.getLastName()) < 0)
                    return -1;

                else {
                    if (o1.getFirstName().compareToIgnoreCase(o2.getFirstName()) > 0)
                        return 1;

                    else if (o1.getFirstName().compareToIgnoreCase(o2.getFirstName()) < 0)
                        return -1;

                    return 0;
                }
            }
        };

        //sort the list
        people.sort(nameCompareator);
    }


    //output roster will iniate sort function and
    // produce a single output of list of names
    public String getSortedOutput() {

        //call sort function
        sortRoster();

        //start building output
        StringBuilder output = new StringBuilder("Total of " + people.size() + " names");

        output.append("\n------------------");

        for (Person person : people) {
            output.append("\n" + person.getLastName() + " " + person.getFirstName());
        }

        return output.toString();
    }
}
