package ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RosterTest {

    //also technically tests my private method in this class
    @Test
    void getSortedOutput_returns_correct_output() {
        Application app = new Application();
        Roster roster = new Roster();

        app.readFile(roster);

        String expected = """
                Total of 7 names
                -----------------
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina""";


        String actual = roster.getSortedOutput();

        assertEquals(expected, actual);
    }
}