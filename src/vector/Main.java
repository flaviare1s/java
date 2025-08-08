package vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> listaNome = new Vector<>();
        listaNome.add("Ruth");
        listaNome.add("Raquel");
        listaNome.add("Rômulo");
        listaNome.add("Rafael");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
    }
}
