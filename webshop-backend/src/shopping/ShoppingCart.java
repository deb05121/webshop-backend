package shopping;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private int totalPrice;
    private User owner;

    public ShoppingCart(List<Product> products, int totalPrice, User owner) {
        this.products = products;
        this.totalPrice = totalPrice;
        this.owner = owner;
    }

    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }

    public boolean removeProduct(Product p) {
        boolean ok = false;
        int pieces = p.getStock();
        if (pieces > 0) {
            p.stockDecrease();
            ok = true;
        }
        return ok;
    }

}
