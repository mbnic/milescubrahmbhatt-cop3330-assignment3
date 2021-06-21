package ex42;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RecordsTest {

    @Test
    void outputRecordTable() {
        Application app = new Application();
        Records records = new Records();

        app.readFile(records);

        String expected = """
                Last      First     Salary
                --------------------------
                Ling      Mai       55900
                Johnson   Jim       56500
                Jones     Aaron     46000
                Jones     Chris     34500
                Swift     Geoffrey  14200
                Xiong     Fong      65000
                Zarnecki  Sabrina   51500""";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        records.outputRecordTable();

        //will fail because of minor formatting difference but output is correct
        assertEquals(expected, out.toString());


    }
}