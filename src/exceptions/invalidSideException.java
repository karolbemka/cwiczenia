package exceptions;

public class invalidSideException extends Exception {

    private String message = "Podane pole ma niepoprawna wartosc";

    @Override
    public String getMessage() {
        return message;
    }
}
