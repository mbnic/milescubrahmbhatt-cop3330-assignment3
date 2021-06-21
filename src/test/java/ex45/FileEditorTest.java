package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileEditorTest {

    @Test
    void replaceWord_correctly_replaces_utilize() {
        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".""";

        FileEditor editor = new FileEditor();
        String actual = editor.replaceWord();

        assertEquals(expected, actual);
    }
}