package shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {
    Validator<String> nameValidator = new NameValidator();

    @ParameterizedTest
    @ValueSource(strings = {"good product", "good abc efg"})
    void isNameValidatorTrue(String productName) {
        Assertions.assertTrue(nameValidator.isValid(productName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Wrong prod", "Wr Pr", "Bob@", "$", ".scr", ".value", "=true", "<script>", "</script>"})
    void isNameValidatorFalse(String productName) {
        Assertions.assertFalse(nameValidator.isValid(productName));
    }

    PriceValidator priceValidator = new PriceValidator();
    MonetaryAmount monetaryAmountA = new MonetaryAmount(234, ShopCurrency.EUR);

    @Test
    void isPriceValidatorTrue() {
        Assertions.assertTrue(priceValidator.isValid(monetaryAmountA));
    }
    MonetaryAmount monetaryAmountB = new MonetaryAmount(-234, ShopCurrency.EUR);
    @Test
    void isPriceValidatorFalse() {
        Assertions.assertFalse(priceValidator.isValid(monetaryAmountB));
    }

    Validator<Integer> stockValidator = new StockValidator();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 345})
    void isStockValidatorTrue(Integer stock) {
        Assertions.assertTrue(stockValidator.isValid(stock));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -345})
    void isStockValidatorFalse(Integer stock) {
        Assertions.assertFalse(stockValidator.isValid(stock));
    }

    Validator<String> cityValidator = new CityValidator();

    @ParameterizedTest
    @ValueSource(strings = {"London", "New Zealand", "Hegyeshalom", "Winston-Salem"})
    void isCityValidatorTrue(String city) {
        Assertions.assertTrue(cityValidator.isValid(city));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bp", "debrecen", "budaPest", "Bob@", "$", ".scr", ".value", "=true", "<script>", "</script>"})
    void isCityValidatorFalse(String city) {
        Assertions.assertFalse(cityValidator.isValid(city));
    }
}
