package shopping;

public class StockValidator extends Validator<Integer>{
    @Override
    boolean isValid(Integer stock) {
        return stock >= 0;
    }
}
