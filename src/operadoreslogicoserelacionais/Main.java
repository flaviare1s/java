package operadoreslogicoserelacionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();
        boolean result = (n1 > n2) || (n2 < n1) ? true : false; // Operador ternário
        System.out.println(result);

    }
}
