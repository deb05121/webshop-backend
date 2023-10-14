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

    public void removeProduct(Product p) {
        int pieces = p.getStock();
        if (pieces > 0) {
            products.remove(p);

        }
    }

}
