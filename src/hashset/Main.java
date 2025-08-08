package hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> listaNomes = new HashSet<>();
        listaNomes.add("Maria");
        listaNomes.add("José");
        listaNomes.add("Ana");
        listaNomes.add("Ana"); // O HashSet não permite elementos repetidos

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
