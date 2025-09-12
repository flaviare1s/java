package custom_exception;

public class LimiteCompraExcedidoException extends RuntimeException {
    public LimiteCompraExcedidoException(String message) {
        super(message);
    }
}
