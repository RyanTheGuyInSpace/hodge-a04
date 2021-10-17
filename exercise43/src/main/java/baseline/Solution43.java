/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        // Declare a WebsiteGenerator
        // Prompt the user for the name of the website they want to create
        // Prompt the user for the website's author's name
        // Ask the user if they want a folder for css files
        // Ask the user if they want a folder for js files
        // Use the website generator to generate a website using the parameters provided by the user

        WebsiteGenerator generator = new WebsiteGenerator();

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the name of the website?");

        String websiteName = scan.nextLine();

        System.out.println("What is the website author's name?");

        String authorName = scan.nextLine();

        System.out.println("Do you want a folder for Javascript?");

        String wantJS = scan.nextLine();

        boolean shouldMakeJS = false;

        if (wantJS.equalsIgnoreCase("y")) {
            shouldMakeJS = true;
        }

        System.out.println("Do you want a folder for CSS?");

        String wantCSS = scan.nextLine();

        boolean shouldMakeCSS = false;

        if (wantCSS.equalsIgnoreCase("y")) {
            shouldMakeCSS = true;
        }

        generator.websiteName = websiteName;

        generator.generateWebsiteDirectory();
        generator.generateIndex(authorName);

        if(shouldMakeJS) {
            generator.generateWebsiteJSDir();
        }

        if(shouldMakeCSS) {
            generator.generateWebsiteCSSDir();
        }



    }
}
