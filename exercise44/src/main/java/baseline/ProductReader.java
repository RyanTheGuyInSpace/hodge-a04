/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import com.google.gson.Gson;

import java.util.List;

public class ProductReader {
    public List<Product> products;
    private Gson gsonReader;

    /**
     * Reads in the products from the input json file and stores them inside of the products variable.
     * @param fileName The name of the file to read the products in from.
     */
    public void readProducts(String fileName) {

    }

    /**
     * Finds the product with the given name inside of the products list.
     * @param productName THe name of the product to find.
     * @return The product with the given name.
     */
    public Product findProduct(String productName) {

        return new Product();
    }

    /**
     * Prints out the details of the specified product.
     * @param product The product whose details will be printed out.
     */
    public void printProduct(Product product) {

    }
}
