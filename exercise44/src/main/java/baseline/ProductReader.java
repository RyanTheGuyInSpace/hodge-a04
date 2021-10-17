/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ProductReader {
    public ProductList products;
    private Gson gsonReader = new Gson();

    /**
     * Reads in the products from the input json file and stores them inside the products variable.
     * @param fileName The name of the file to read the products in from.
     */
    public void readProducts(String fileName) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(String.format("%s", fileName)));

            products = gsonReader.fromJson(reader, ProductList.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Finds the product with the given name inside the products list.
     * @param productName The name of the product to find.
     * @return The product with the given name.
     */
    public Product findProductByName(String productName) {

        for (Product product : products.products) {
            if (product.name.equalsIgnoreCase(productName)) {
                return product;
            }
        }

        return new Product();
    }


}
