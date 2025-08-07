package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Ana");
        listaNome.add("Maria");
        listaNome.add("José");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

        Comparator<String> comparator = Collections.reverseOrder();

        Collections.sort(listaNome, comparator);

        System.out.println("Elementos depos da ordenação: ");

        Iterator<String> iterator = listaNome.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
