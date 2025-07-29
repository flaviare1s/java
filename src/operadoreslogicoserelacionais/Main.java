package operadoreslogicoserelacionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        String emancipado;
        boolean podeDirigir;

        System.out.print("Qual a sua idade?");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Você é emancidado? (s/n)");
        emancipado = String.valueOf(scanner.next().charAt(0));

        podeDirigir = (idade >= 18) || (idade >= 16 && emancipado.equalsIgnoreCase("s"));

        System.out.println(podeDirigir ? "Pode dirigir" : "Não pode dirigir");
    }
}
