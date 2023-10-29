package shopping;

public class CityValidator extends Validator<String>{
    @Override
    boolean isValid(String city) {
        return city.matches("^[A-Z][a-zA-Z -]*");
    }
}
