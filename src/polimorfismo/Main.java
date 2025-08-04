package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Peixe animal1 = new Peixe();
        Mamifero animal2 = new Mamifero();
        Ave animal3 = new Ave();
        Reptil animal4 = new Reptil();
        Canguru animal5 = new Canguru();
        Tartaruga animal6 = new Tartaruga();
        Cachorro animal7 = new Cachorro();

        animal1.alimentar();
        animal1.soltarBolha();
        animal2.alimentar();
        animal3.alimentar();
        animal4.alimentar();
        animal1.locomover();
        animal2.locomover();
        animal3.locomover();
        animal4.locomover();
        animal5.locomover();
        animal6.locomover();
        animal7.emitirSom();
    }
}
