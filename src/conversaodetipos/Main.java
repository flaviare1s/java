package conversaodetipos;

public class Main {
    public static void main(String[] args) {

        // Convertendo string em inteiro:
        String valor = "30";
        int idade = Integer.parseInt(valor);

        System.out.println("String convertida: " + idade);

        // Convertendo inteiro em string:
        int numero = 2;
        String valor2 = Integer.toString(numero);

        System.out.println("Número convertido: " + valor2);
    }
}
