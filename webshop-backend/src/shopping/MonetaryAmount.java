package shopping;

import java.util.Currency;

public class MonetaryAmount {
    private final int amount;
    private final ShopCurrency currency;

    public MonetaryAmount(int amount, ShopCurrency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public ShopCurrency getCurrency() {
        return currency;
    }
}
