package uec;

public class Main {
    public static void main(String[] args) {
        Lutador[] lutador = new Lutador[6];

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 68.9f, 1.75f, 11, 2, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 57.8f, 1.68f, 12, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 80.9f, 1.70f, 5, 2, 1);
        lutador[3] = new Lutador("Dead Code", "França", 34, 81.6f, 1.85f, 10, 12, 1);
        lutador[4] = new Lutador("UFO Cobol", "França", 31, 119.9f, 1.77f, 1, 2, 11);
        lutador[5] = new Lutador("Nerdaart", "França", 30, 105.9f, 1.89f, 15, 2, 1);

        Luta luta1 = new Luta();

        luta1.marcarLuta(lutador[4], lutador[5]);
        luta1.lutar();
    }
}
