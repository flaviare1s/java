package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.reagir("Olá");
        cachorro1.reagir(false);
        cachorro1.reagir(8, 4.5f);
        cachorro1.reagir(11, 50);
    }
}
