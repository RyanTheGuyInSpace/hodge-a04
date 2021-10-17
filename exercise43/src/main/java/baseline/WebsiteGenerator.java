/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {
    private BufferedWriter writer;
    public String websiteName;

    /**
     * Creates the base folder that will contain the website's files.
     */
    public void generateWebsiteDirectory() {
        String websitePath = String.format("data/%s", this.websiteName);

        new File(websitePath).mkdirs();

        System.out.println(String.format("Created ./%s", websitePath));
    }

    /**
     * Creates an index.html file for the website that contains the website's name and the author's name.
     * @param authorName The name of the website author
     */
    public void generateIndex(String authorName) {
        if (this.websiteName == null) {
            System.out.println("There is currently no website name set. Please set one to proceed.");
        }

        new File(String.format("data/%s", this.websiteName)).mkdirs();

        try {
            String indexPath = String.format("data/%s/index.html", this.websiteName);

            new File(indexPath).createNewFile();

            writer = new BufferedWriter(new FileWriter(indexPath));

            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write(String.format("<title>%s</title>%n", this.websiteName));
            writer.write(String.format("<meta name=\"author\" content=\"%s\">%n", authorName));
            writer.write("</head>\n");
            writer.write("</html>\n");

            writer.flush();

            System.out.println(String.format("Created ./%s", indexPath));

        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
            return;
        }

    }

    /**
     * Generates the CSS folder for the website.
     */
    public void generateWebsiteCSSDir() {
        if (this.websiteName == null) {
            System.out.println("There is currently no website name set. Please set one to proceed.");
        }

        String cssPath = String.format("data/%s/css", this.websiteName);

        new File(cssPath).mkdirs();

        System.out.println(String.format("Created ./%s", cssPath));
    }

    /**
     * Generates the JS folder for the website.
     */
    public void generateWebsiteJSDir() {
        if (this.websiteName == null) {
            System.out.println("There is currently no website name set. Please set one to proceed.");
        }

        String jsPath = String.format("data/%s/js", this.websiteName);

        new File(jsPath).mkdirs();

        System.out.println(String.format("Created ./%s", jsPath));
    }
}
