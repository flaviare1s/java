package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> listaNomes = new LinkedList<>();
        List<String> listaNomes2 = new LinkedList<>();

        listaNomes.add("Maria");
        listaNomes.addLast("José");
        listaNomes.addFirst("Ana");
        listaNomes.add(3, "Sérgio");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        listaNomes2.add("Maria");
        listaNomes2.addLast("José");
        listaNomes2.addFirst("Ana");

        for (String nome : listaNomes2) {
            System.out.println(nome);
        }
    }
}
