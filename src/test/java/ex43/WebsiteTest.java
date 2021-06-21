package ex43;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {


    @Test
    void createSiteFolder() {
        Website website = new Website();

        website.setSiteName("awesomeco");

        String expected = "Created ./website/awesomeco";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        website.createSite();

        assertEquals(expected, out.toString());
    }
}