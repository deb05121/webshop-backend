package shopping;

public class User {

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setBalance(MonetaryAmount balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public MonetaryAmount getBalance() {
        return balance;
    }

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
