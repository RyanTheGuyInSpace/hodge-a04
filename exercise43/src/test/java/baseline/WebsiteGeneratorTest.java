package baseline;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void generateWebsiteDirectory() {
        WebsiteGenerator generator = new WebsiteGenerator();

        generator.websiteName = "TestSite";

        generator.generateWebsiteDirectory();

        assertTrue(Files.exists(Path.of("data/TestSite")));
    }

    @Test
    void generateIndex() {
        WebsiteGenerator generator = new WebsiteGenerator();

        generator.websiteName = "SuperTestSite";

        generator.generateIndex("Ryan Hodge");

        assertTrue(Files.exists(Path.of("data/SuperTestSite/index.html")));
    }

    @Test
    void generateWebsiteCSSDir() {
        WebsiteGenerator generator = new WebsiteGenerator();

        generator.websiteName = "OtherSuperTestSite";

        generator.generateWebsiteCSSDir();

        assertTrue(Files.exists(Path.of("data/OtherSuperTestSite/css")));
    }

    @Test
    void generateWebsiteJSDir() {
        WebsiteGenerator generator = new WebsiteGenerator();

        generator.websiteName = "OtherSuperTestSite";

        generator.generateWebsiteJSDir();

        assertTrue(Files.exists(Path.of("data/OtherSuperTestSite/js")));
    }
}