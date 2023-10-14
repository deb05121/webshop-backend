public class Validator {

    public static boolean sysIsNameValid(String name) {
        return isNameValid(name);
    }

    public static boolean sysPriceValid(int price) {
        return isPriceValid(price);
    }

    public static boolean sysStockValid(int stock) {
        return isStockValid(stock);
    }

    private static boolean isNameValid(String name) {
        return name.matches("[a-z ]+$");

    }

    private static boolean isPriceValid(int price) {
        return price > 0;
    }

    private static boolean isStockValid(int stock) {
        return stock >= 0;
    }


}
