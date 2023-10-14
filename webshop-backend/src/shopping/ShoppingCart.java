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

    public boolean addProduct(Product p) {
        boolean ok = false;
        if (p != null) {
            products.add(p);
            ok = true;
        }
        return ok;
    }

    public boolean removeProduct(Product p) {

        boolean ok = false;
        int pieces = p.getStock();
        if (p != null) {
            if (pieces > 0) {
                p.stockDecrease();
                ok = true;
            }
        }
        return ok;
    }

}
