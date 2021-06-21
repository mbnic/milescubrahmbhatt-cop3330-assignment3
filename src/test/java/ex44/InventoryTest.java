package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void searchInventory_finds_Thing_item() {
        Application app = new Application();
        Inventory inventory = new Inventory();
        app.readJSON(inventory);


        //returns false if found
        boolean actual = inventory.searchInventory("Thing");

        assertEquals(false, actual);
    }

    @Test
    void searchInventory_finds_Doodad_item() {
        Application app = new Application();
        Inventory inventory = new Inventory();
        app.readJSON(inventory);


        //returns false if found
        boolean actual = inventory.searchInventory("Doodad");

        assertEquals(false, actual);
    }

    @Test
    void searchInventory_returns_false_ifNO_item() {
        Application app = new Application();
        Inventory inventory = new Inventory();
        app.readJSON(inventory);


        //returns false if found
        boolean actual = inventory.searchInventory("Galaxy");

        assertEquals(true, actual);
    }
}