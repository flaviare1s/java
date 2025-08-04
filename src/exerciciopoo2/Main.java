package exerciciopoo2;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de Java");
        v[2] = new Video("Aula de Desenvolvimento Web");

        System.out.println(v[0]);

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 20, "F", "creuzinha");

        System.out.println(g[0]);
    }
}
