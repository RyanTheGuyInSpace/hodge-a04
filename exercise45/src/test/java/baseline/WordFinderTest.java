package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void writeToFile() {
        WordFinder finder = new WordFinder();

        finder.readContent("testInput2.txt");
        finder.replaceWord("test", "something");
        finder.writeToFile("testOutput2.txt");
        finder.readContent("testOutput2.txt");

        assertTrue(finder.content.contains("something"));
    }

    @Test
    void readContent() {
        WordFinder finder = new WordFinder();

        finder.readContent("testInput.txt");

        assertNotNull(finder.content);
    }

    @Test
    void replaceWord() {
        WordFinder finder = new WordFinder();

        finder.readContent("testInput.txt");
        finder.replaceWord("utilize", "use");

        assertFalse(finder.content.contains("utilize"));
    }
}