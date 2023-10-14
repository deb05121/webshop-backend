package shopping;

public class Product {
    private int stock;

    public int getStock() {
        return stock;
    }
    public void decreaseStock(){
        stock--;
    }
    public void increaseStock(){
        stock++;
    }

}
