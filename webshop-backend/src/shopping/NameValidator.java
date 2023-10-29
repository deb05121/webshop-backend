package shopping;
public class NameValidator extends Validator<String>{
    @Override
    public boolean isValid(String name) {
        return name.matches("[a-z ]+$");
    }
}
