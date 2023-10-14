package shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shopping.MonetaryAmount;
import shopping.Product;

import java.util.Currency;

public class ProductTest {
    @Test
    void testProduct(){
        MonetaryAmount price = new MonetaryAmount(8, Currency.getInstance("USD"));
        Product product = new Product("Milk",price,20);
        Product product2 = new Product("Cheese",price,11);

        Assertions.assertEquals(0, product.getId());
        Assertions.assertEquals(1,product2.getId());
    }
}
