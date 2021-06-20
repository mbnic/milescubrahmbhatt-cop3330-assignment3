/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex44;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Products> inventory = new HashMap<>();


    //adds an item to our inventory
    public void addToInventory(String name, String price, String quantity) {
        //create new product
        Products newItem = new Products(name, price, quantity);

        //add to our inventory map
        inventory.put(name, newItem);
    }

    //searches inventory for userItem and prints attributes or not found
    public boolean searchInventory(String userItem) {
        if (inventory.containsKey(userItem)) {
            Products p = inventory.get(userItem);
            System.out.printf("Name: %s\nPrice: %s\nQuantity: %s\n", p.name, p.price, p.quantity);

            //return false to terminate program
            return false;
        }
        else {
            System.out.print("Sorry, that product was not found in our inventory.\n");

            //return true so user can keep asking for products
            return true;
        }
    }
}
