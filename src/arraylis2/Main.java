package arraylis2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Ruth");
        listaNome.add("Raquel");
        listaNome.add("Rômulo");
        listaNome.add("Rafael");

        System.out.println("Antes: ");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

        listaNome.set(1, "Jujuba");

        System.out.println("Depois: ");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

        listaNome.remove(2);
    }
}
