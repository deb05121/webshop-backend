public class Product {
    private static long idCounter = 0;
    private long id;
    private String name;
    private MonetaryAmount price;
    private int stock;

    public Product(String name, MonetaryAmount price, int stock) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MonetaryAmount getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
