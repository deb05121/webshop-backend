package shopping;

public class PriceValidator extends Validator<MonetaryAmount>{

    @Override
    boolean isValid(MonetaryAmount amount) {

        return amount.getAmount() > 0;
    }
}
