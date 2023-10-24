package shopping;

import java.util.ArrayList;
import java.util.List;

public class PayService {
    private PayService() {
    }

    public static ShoppingCart pay(ShoppingCart shoppingCart) {
        if (hasSufficientBalance(shoppingCart.getOwner(), shoppingCart)) {
            shoppingCart.getOwner().setBalance(getNewBalance(shoppingCart));
            getShoppingList(shoppingCart);
            shoppingCart = setShoppingCartEmpty(shoppingCart);
        } else {
            System.err.println("User has insufficient balance!");
        }
        return shoppingCart;
    }

    private static void getShoppingList(ShoppingCart shoppingCart) {
        System.out.printf("Customer's name: %s, products he/she bought:\n",shoppingCart.getOwner().getName());
        for (Product product : shoppingCart.getProducts()) {
            System.out.println(product);
        }
    }

    private static ShoppingCart setShoppingCartEmpty(ShoppingCart shoppingCart) {
        List<Product> products = new ArrayList<>();
        return new ShoppingCart(products, shoppingCart.getOwner());
    }

    private static MonetaryAmount getNewBalance(ShoppingCart shoppingCart) {
        var userBalance = shoppingCart.getOwner().getBalance();
        int modifiedBalanceAmount = userBalance.getAmount() - getTotalPrice(shoppingCart).getAmount();
        return new MonetaryAmount(modifiedBalanceAmount, userBalance.getCurrency());
    }

    private static boolean hasSufficientBalance(User cartOwner, ShoppingCart shoppingCart) {
        return cartOwner.getBalance().getAmount() >= getTotalPrice(shoppingCart).getAmount();
    }

    private static MonetaryAmount getTotalPrice(ShoppingCart shoppingCart) {
        int totalPrice = 0;
        for (Product product : shoppingCart.getProducts()) {
            totalPrice += product.getPrice().getAmount();
        }
        return new MonetaryAmount(totalPrice, shoppingCart.getOwner().getBalance().getCurrency());
    }
}
