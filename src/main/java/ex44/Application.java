/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex44;

import com.google.gson.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application {

    //main method
    public static void main(String[] args) {
        Application app = new Application();
        Inventory inventory = new Inventory();
        app.readJSON(inventory);
        runUserSearch(inventory);
    }

    //read json file
    public void readJSON(Inventory inventory) {

        try {
            //create parser and make json file an object
            JsonElement fileElement =
                    JsonParser.parseReader(new FileReader("src/main/java/ex44/exercise44_input.json"));

            JsonObject fileObject = fileElement.getAsJsonObject();

            //array of json objects within the products field of the json file
            JsonArray jsonProductArray = fileObject.get("products").getAsJsonArray();

            //loop through elements in file
            for (JsonElement productElements: jsonProductArray) {

                //each element of products becomes own object
                JsonObject productJsonObject = productElements.getAsJsonObject();

                //get data
                String name = productJsonObject.get("name").getAsString();
                String price = productJsonObject.get("price").getAsString();
                String quantity = productJsonObject.get("quantity").getAsString();

                //send to inventory
                inventory.addToInventory(name, price, quantity);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //use while loop to run ask for user queries
    public static void runUserSearch(Inventory inventory) {
        boolean bool = true;
        Scanner in = new Scanner(System.in);

        //run product search for user
        while (bool) {

            System.out.print("What is the product name? (0 to quit): ");
            String response = in.nextLine();

            if (response.equals("0"))
                bool = false;
            else
                bool = inventory.searchInventory(response);
        }

        in.close();
    }
}
