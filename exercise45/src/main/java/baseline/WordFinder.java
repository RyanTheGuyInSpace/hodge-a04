/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordFinder {
    private BufferedReader reader;
    private BufferedWriter writer;
    public String content;

    /**
     * Writes the content String into the target file. The file gets generated if it doesn't already exist.
     * @param fileName The name of the file to write the content String into.
     */
    public void writeToFile(String fileName) {
        try {
            writer = new BufferedWriter(new FileWriter(String.format("data/%s", fileName)));

            writer.write(this.content);

            writer.flush();
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }

    /**
     * Reads the entirety of the specified file into the content String.
     * @param fileName The name of the file to read into the content String.
     */
    public void readContent(String fileName) {
        try {
            reader = new BufferedReader(new FileReader(String.format("data/%s", fileName)));

            content = Files.readString(Path.of(String.format("data/%s", fileName)));
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }

    /**
     * Replaces all instances of the targetWord with the replacementWord in the content String.
     * @param targetWord The target that will be replaced by the replacementWord.
     * @param replacementWord The word that will replace every instance of the targetWord.
     */
    public void replaceWord(String targetWord, String replacementWord) {
        this.content = this.content.replace(targetWord, replacementWord);
    }
}
