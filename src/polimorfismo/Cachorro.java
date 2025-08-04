package polimorfismo;

public class Cachorro extends Mamifero {
    public void enterrarOsso() {
        System.out.println("Enterrando osso...");
    }

    public void ababarRabo() {
        System.out.println("Abanando o rabo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
