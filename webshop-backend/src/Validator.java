public class Validator {

    public static boolean isNameValid(String name) {
        return name.matches("[a-z ]+$");

    }

    public static boolean isPriceValid(int price) {
        return price > 0;
    }

    public static boolean isStockValid(int stock) {
        return stock >= 0;
    }

}
