package shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shopping.Validator;

public class ValidatorTest {

    @Test
    void testValidator() {
        Assertions.assertEquals(true, Validator.isNameValid("good product"));
        Assertions.assertEquals(false, Validator.isNameValid("good Product"));
        Assertions.assertEquals(true, Validator.isPriceValid(234));
        Assertions.assertEquals(false, Validator.isPriceValid(-2));
        Assertions.assertEquals(true, Validator.isStockValid(0));
        Assertions.assertEquals(false, Validator.isStockValid(-1));
    }

}
