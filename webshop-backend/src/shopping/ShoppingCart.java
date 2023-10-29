package shopping;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    //private User owner;

   /* public ShoppingCart(List<Product> products, User owner) {
        this.products = products;
        this.owner = owner;
    }*/
   public ShoppingCart(List<Product> products) {
       this.products = products;

   }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice().getAmount();
        }
        return totalPrice;
    }

    public void setProductListEmpty() {
        products.clear();
    }

    public List<Product> getProducts() {
        return products;
    }

   /* public User getOwner() {
        return owner;
    }*/

    public boolean addProduct(Product p) {
        boolean ok = false;
        if (p != null) {
            //nem lehet 0 a stock, mert abból nem tudok levonni darabszámot
            if (p.getStock() != 0) {
                products.add(p);
                p.decreaseStock();
                ok = true;
            }
        }
        return ok;
    }

    public boolean removeProduct(Product p) {
        boolean ok = false;
        int pieces = p.getStock();
        if (p != null) {
            if (pieces > 0) {

                //nem lehet -1 a kosár tartalma
                if (products.contains(p)) {
                    products.remove(p);
                    p.increaseStock();
                    ok = true;
                }
            }
        }
        return ok;
    }

}
