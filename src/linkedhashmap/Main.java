package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> linguagensProgramacao = new LinkedHashMap<>();

        linguagensProgramacao.put(1, "HTML");
        linguagensProgramacao.put(2, "CSS");
        linguagensProgramacao.put(3, "JavaScript");
        linguagensProgramacao.put(4, "Java");

        System.out.println("Lista 1: " + linguagensProgramacao);

        LinkedHashMap<Integer, String> lista2 = new LinkedHashMap<>(linguagensProgramacao);

        lista2.put(5, "C#");

        System.out.println("Lista 2: " + lista2);

    }
}
