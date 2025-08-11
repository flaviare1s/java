package bubblesort;

public class Main {
    public static int[] Bolha (int numeros []) {
        final int n = numeros.length;
        int aux;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        int i;
        int[] vet = {9, 5, 1, 3, 10, 8, 4, 6, 7, 2};

        vet = Bolha(vet);

        for (i = 0; i < 10; i++) {
            System.out.println(vet[i] + " ");
        }
        System.exit(0);
    }
}
