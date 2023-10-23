package shopping;

public class PriceValidator extends Validator<Integer>{

    @Override
    boolean isValid(Integer price) {
        return price > 0;
    }
}
