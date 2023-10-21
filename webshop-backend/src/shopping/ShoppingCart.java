package shopping;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    
    private User owner;

    public ShoppingCart(List<Product> products, User owner) {
        this.products = products;
        this.owner = owner;
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getOwner() {
        return owner;
    }

    public boolean addProduct(Product p) {
        boolean ok = false;
        if (p != null) {
            products.add(p);
            p.decreaseStock();
            ok = true;
        }
        return ok;
    }

    public boolean removeProduct(Product p) {
        boolean ok = false;
        int pieces = p.getStock();
        if (p != null) {
            if (pieces > 0) {
                products.remove(p);
                p.increaseStock();
                ok = true;
            }
        }
        return ok;
    }

}
