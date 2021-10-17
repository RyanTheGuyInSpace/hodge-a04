package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductReaderTest {

    @Test
    void readProducts() {
        ProductReader reader = new ProductReader();

        reader.readProducts("data/testInput.json");

        assertEquals("Car", reader.products.products.get(0).name);
    }

    @Test
    void findProductByName() {
        ProductReader reader = new ProductReader();

        reader.readProducts("data/testInput.json");
        Product product = reader.findProductByName("Boat");

        assertEquals("Boat", product.name);
    }
}