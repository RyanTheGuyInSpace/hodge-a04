/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        // Declare an instance of ProductReader
        // Use the ProductReader to read the json file of products and store them into the ProductReader
        // Prompt the user to search for the name of a product
        // If the product is found inside the list of products inside  ProductReader, print out its details
        // If the product isn't found inside the list of products, prompt the user again

        ProductReader reader = new ProductReader();

        Scanner scan = new Scanner(System.in);

        reader.readProducts("data/exercise44_input.json");

        boolean loop = true;

        while (loop) {
            System.out.println("What is the product name?");

            String productName = scan.nextLine();

            Product product = reader.findProductByName(productName);

            if (product.name != null) {
                product.printDetails();

                loop = false;
            } else {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }


    }
}
