package poo1;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Bic", "azul", 1, 0.5f);
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.status();

        System.out.println("---------------");

        Caneta caneta2 = new Caneta("Faber Castel", "preta", 1, 0.7f);
        caneta2.rabiscar();
        caneta2.status();
    }
}
