package shopping;

public enum ShopCurrency {
    HUF,EUR,USD,GBP;

    @Override
    public String toString() {
        switch(this){
            case EUR -> {
                return "€";
            }
            case GBP -> {
                return "£";
            }
            case HUF -> {
                return "Ft";
            }
            case USD -> {
                return "$";
            }
        }
        return "";
    }
}
