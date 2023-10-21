package shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @Test
    void testValidator() {
        Assertions.assertTrue(Validator.isNameValid("good product"));
        Assertions.assertFalse(Validator.isNameValid("good Product"));
        Assertions.assertTrue(Validator.isPriceValid(234));
        Assertions.assertFalse(Validator.isPriceValid(-2));
        Assertions.assertTrue(Validator.isStockValid(0));
        Assertions.assertFalse(Validator.isStockValid(-1));
    }

}
