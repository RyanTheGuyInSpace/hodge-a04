/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

public class Solution41 {
    public static void main(String[] args) {

        // Create instance of NameSorter
        // Open file to read names from
        // Use NameSorter to read in names from the input file and store them inside the names variable
        // Sort the names inside the NameSorter names variable
        // Print the sorted list of names into an output file along with a line counting the number of names written

        NameSorter sorter = new NameSorter();

        sorter.readNames("data/exercise41_input.txt");

        sorter.sortNames();

        sorter.writeNames("data/exercise41_output.txt");

    }
}
