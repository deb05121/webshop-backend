package shopping;

import java.util.ArrayList;
import java.util.List;

public class PayService {
    private PayService() {
    }

    public static ShoppingCart pay(ShoppingCart shoppingCart) {
        if (hasSufficientBalance(shoppingCart.getOwner(), shoppingCart)) {
            shoppingCart.getOwner().setBalance(getNewBalance(shoppingCart));
            shoppingCart = setShoppingCartEmpty(shoppingCart);
        } else {
            System.err.println("User has insufficient balance!");
        }
        return shoppingCart;
    }

    private static ShoppingCart setShoppingCartEmpty(ShoppingCart shoppingCart) {
        List<Product> products = new ArrayList<>();
        return new ShoppingCart(products, shoppingCart.getOwner());
    }

    private static MonetaryAmount getNewBalance(ShoppingCart shoppingCart) {
        int modifiedBalanceAmount = shoppingCart.getOwner().getBalance().getAmount() - getTotalPrice(shoppingCart).getAmount();
        return new MonetaryAmount(modifiedBalanceAmount, ShopCurrency.EUR);
    }

    private static boolean hasSufficientBalance(User cartOwner, ShoppingCart shoppingCart) {
        return cartOwner.getBalance().getAmount() >= getTotalPrice(shoppingCart).getAmount();
    }

    private static MonetaryAmount getTotalPrice(ShoppingCart shoppingCart) {
        int totalPrice = 0;
        for (Product product : shoppingCart.getProducts()) {
            totalPrice += product.getPrice().getAmount();
        }
        return new MonetaryAmount(totalPrice, ShopCurrency.EUR);
    }
}
