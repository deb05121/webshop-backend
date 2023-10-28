package shopping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world.");

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Milk", new MonetaryAmount(8, ShopCurrency.EUR), 3));
        productList.add(new Product("Bread", new MonetaryAmount(3, ShopCurrency.EUR), 2));

        User user = new User();
        ShoppingCart shoppingCart = new ShoppingCart(productList, user);
        shoppingCart.getOwner().setName("John");
        shoppingCart.getOwner().setAddress(new Address(Country.GERMANY, "München"));
        shoppingCart.getOwner().setAge(22);
        shoppingCart.getOwner().setBalance(new MonetaryAmount(50, ShopCurrency.EUR));


        System.out.println(PayService.pay(shoppingCart));
        System.out.println(shoppingCart.getProducts());

        User user2 = new User(
            "Csongor",
            new Address(Country.HUNGARY, "Makó"),
            31,
            new ShoppingCart(new ArrayList<>(), null), //TODO: set user
            new MonetaryAmount(50000, ShopCurrency.GBP)
        );
    }
}
