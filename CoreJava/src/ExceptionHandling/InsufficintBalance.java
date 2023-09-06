package ExceptionHandling;

public class InsufficintBalance extends RuntimeException {
    public InsufficintBalance(String s) {
        super(s);
    }
}
