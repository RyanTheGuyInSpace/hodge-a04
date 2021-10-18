/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {
        // Declare a new instance of a WordFinder
        // Use the WordFinder to read the example file
        // Use the WordFinder to replace every instance of the target word
        // Print the content string of WordFinder back into a target file

        WordFinder finder = new WordFinder();

        Scanner scan = new Scanner(System.in);

        finder.readContent("exercise45_input.txt");
        finder.replaceWord("utilize", "use");

        System.out.println("What file do you want to write to?");

        String fileName = scan.nextLine();

        finder.writeToFile(fileName);

    }
}
