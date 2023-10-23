package shopping;

import org.junit.jupiter.api.Assertions;
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
    @ValueSource(strings = {"Wrong prod", "Wr Pr"})
    void isNameValidatorFalse(String productName) {
        Assertions.assertFalse(nameValidator.isValid(productName));
    }

    Validator<Integer> priceValidator = new PriceValidator();

    @ParameterizedTest
    @ValueSource(ints = {234, 1234, 98765})
    void isPriceValidatorTrue(Integer price) {
        Assertions.assertTrue(priceValidator.isValid(price));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -234, -34567})
    void isPriceValidatorFalse(Integer price) {
        Assertions.assertFalse(priceValidator.isValid(price));
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
    @ValueSource(strings = {"bp", "debrecen", "budaPest"})
    void isCityValidatorFalse(String city) {
        Assertions.assertFalse(cityValidator.isValid(city));
    }
}
