package custom_exception;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento(200);

        evento1.comprarIngresso(8);

        System.out.println(evento1.getQtdDisponivel());
    }
}
