package treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> listaNomes = new TreeSet<>();
        listaNomes.add("Maria");
        listaNomes.add("José");
        listaNomes.add("Ana");

        System.out.println(listaNomes);
        System.out.println(listaNomes.first());
        System.out.println(listaNomes.last());
    }
}
