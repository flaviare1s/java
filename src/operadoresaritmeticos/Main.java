package operadoresaritmeticos;

public class Main {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float media = (float) (n1 + n2) / 2;
        System.out.println(media);
        System.out.println(Math.PI);
        System.out.println(Math.pow(n1, 2)); // Potência
        System.out.println(Math.sqrt(25)); // Raiz quadrada
        System.out.println(Math.cbrt(27)); // Raiz cúbica
        System.out.println(Math.abs(-10)); // Valor absoluto
        System.out.println(Math.floor(3.9)); // Arredonda pra baixo
        System.out.println(Math.ceil(3.9)); // Arredonda pra cima
        System.out.println(Math.round(3.9)); // Arredonda
        double aleatorio = Math.random() * 100; // Gera número aleatório
        System.out.println(Math.floor(aleatorio));
    }
}
