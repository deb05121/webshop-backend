package shopping;

public class MonetaryAmount {
    private int amount;
    private final ShopCurrency currency;

    public MonetaryAmount(int amount, ShopCurrency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ShopCurrency getCurrency() {
        return currency;
    }
}
