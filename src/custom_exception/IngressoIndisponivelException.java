package custom_exception;

public class IngressoIndisponivelException extends RuntimeException {
    public IngressoIndisponivelException(String message) {
        super(message);
    }
}
