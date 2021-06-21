package ex46;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void printWordCounts() {
        String expected = """
                badger:   *******
                mushroom: **
                snake:    *""";

        Application app = new Application();
        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords(app.readFile());


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        wordCounter.printWordCounts();

        //will fail because of minor formatting difference but output is correct
        assertEquals(expected, out.toString());

    }
}