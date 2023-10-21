package shopping;

public class User {

    private String name;
    private Address address;
    private int age;
    private ShoppingCart shoppingCart;
    private MonetaryAmount balance;

    public User(String name, Address address, int age, ShoppingCart shoppingCart, MonetaryAmount balance) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.shoppingCart = shoppingCart;
        this.balance = balance;
    }
}
