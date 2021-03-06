/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

public class Product {
    public String name;
    public double price;
    public int quantity;

    /**
     * Prints out the details of the specified product.
     */
    public void printDetails() {
        System.out.println(String.format("Name: %s", this.name));
        System.out.println(String.format("Price: %.2f", this.price));
        System.out.println(String.format("Name: %d", this.quantity));
    }
}
