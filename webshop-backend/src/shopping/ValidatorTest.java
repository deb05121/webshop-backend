package shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @Test
    void nameValidatorTest() {
        Assertions.assertTrue(Validator.isNameValid("good product"));
        Assertions.assertFalse(Validator.isNameValid("good Product"));
    }

    @Test
    void isPriceValidatorTest() {
        Assertions.assertTrue(Validator.isPriceValid(234));
        Assertions.assertFalse(Validator.isPriceValid(-2));
    }

    @Test
    void isStockValidatorTest() {
        Assertions.assertTrue(Validator.isStockValid(0));
        Assertions.assertFalse(Validator.isStockValid(-1));
    }

    @Test
    void isCityValidatorTest() {
        Assertions.assertTrue(Validator.isCityValid("London"));
        Assertions.assertTrue(Validator.isCityValid("New Zealand"));
        Assertions.assertFalse(Validator.isCityValid("budapest"));
        Assertions.assertTrue(Validator.isCityValid("Hegyeshalom"));
        Assertions.assertTrue(Validator.isCityValid("Winston-Salem"));
    }

}
