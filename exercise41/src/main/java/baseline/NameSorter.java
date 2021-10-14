/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameSorter {
    public LinkedList<String> names = new LinkedList<>();
    private BufferedReader reader;
    private BufferedWriter writer;

    /**
     * Reads names from the specified file and stores them inside the names variable.
     * @param fileName The name of the file to read the names from.
     */
    public void readNames(String fileName) {
        try {
            reader = new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();
            while(line != null) {
                names.add(line);

                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
            return;
        }
    }

    /**
     * Sorts the names variable alphabetically.
     */
    public void sortNames() {
        Collections.sort(names);
    }

    /**
     * Writes all data inside the names variable to the specified file.
     * @param fileName The name of the file to write the names into.
     */
    public void writeNames(String fileName) {

        try {
            writer = new BufferedWriter(new FileWriter(fileName));

            writer.write(String.format("Total of %d names", names.size()));
            writer.newLine();
            writer.write("-------------------");
            writer.newLine();

            for (int i = 0; i < names.size(); i++) {
                writer.write(names.get(i));
                writer.newLine();
            }

            writer.flush();

        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
            return;
        }

    }
}
