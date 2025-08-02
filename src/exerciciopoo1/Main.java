package exerciciopoo1;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 20, "F");

        l[0] = new Livro("Aprendendo Java", "Guanabara", 301, p[0]);
        l[1] = new Livro("POO para iniciantes", "Gustavo Guanabara", 200, p[0]);
        l[2] = new Livro("Java Avançado", "Guanabara", 350, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
    }
}
