package tiposprimitivos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade = 12;
        int idade2 = (int) 22;
        Integer idade3 = new Integer(33); // deprecated

        float peso = 44.0f;
        float peso2 = (float) 55.5;

        char letra = 'g';
        char letra2 = (char) 'G';
        String nome = "José";

        boolean casado = false;
        boolean casado2 = (boolean) true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var nome2 = scanner.next();


        System.out.println(idade);
        System.out.println(idade2);
        System.out.println(idade3);
        System.out.println(peso);
        System.out.println(peso2);
        System.out.println(letra);
        System.out.println(letra2);
        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(casado);
        System.out.println(casado2);
    }
}
