package shopping;

public class Validator {

    private Validator() {

    }

    public static boolean isNameValid(String name) {
        return name.matches("[a-z ]+$");

    }

    public static boolean isPriceValid(int price) {
        return price > 0;
    }

    public static boolean isStockValid(int stock) {
        return stock >= 0;
    }

    public static boolean isCityValid(String city){
        return city.matches("^[A-Z][a-zA-Z -]*");
    }

}
