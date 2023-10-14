package shopping;

public class Product {
    private int stock;

    public int getStock() {
        return stock;
    }
    public void stockDecrease(){
        stock--;
    }
    public void stockIncrease(){
        stock++;
    }

}
