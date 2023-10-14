package shopping;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products;
    private int totalPrice;
    private User owner;

    public ShoppingCart(ArrayList<Product> products, int totalPrice, User owner) {
        this.products = products;
        this.totalPrice = totalPrice;
        this.owner = owner;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p){
        products.remove(p);
    }

}
