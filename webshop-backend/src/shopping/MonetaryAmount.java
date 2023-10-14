package shopping;

import java.util.Currency;

public class MonetaryAmount {
    private int amount;
    private Currency currency;

    public MonetaryAmount(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
