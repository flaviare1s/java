package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> cargoSalario = new HashMap<>();

        cargoSalario.put("Maria", 3000.00);
        cargoSalario.put("Ana", 3500.00);
        cargoSalario.put("José", 3500.00);

        System.out.println(cargoSalario);

        Double resultadoBusca = cargoSalario.get("Ana");
        System.out.println(resultadoBusca);

        System.out.println("Chaves: " + cargoSalario.keySet());
        System.out.println("Valores: " + cargoSalario.values());
        System.out.println("Chaves e valores: " + cargoSalario.entrySet());
    }
}
