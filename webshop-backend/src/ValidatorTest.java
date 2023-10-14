import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @Test
    void testValidator() {
        Assertions.assertEquals(true, Validator.sysIsNameValid("good product"));
        Assertions.assertEquals(false, Validator.sysIsNameValid("good Product"));
        Assertions.assertEquals(true, Validator.sysPriceValid(234));
        Assertions.assertEquals(false, Validator.sysPriceValid(-2));
        Assertions.assertEquals(true, Validator.sysStockValid(0));
        Assertions.assertEquals(false, Validator.sysStockValid(-1));
    }

}
