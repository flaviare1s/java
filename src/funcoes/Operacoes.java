package funcoes;

public class Operacoes {
    public static String contador(int inicio, int fim) {
        String resultado = "";
        for (int i = inicio; i <= fim; i++) {
            resultado += i + " ";
        }
        return resultado;
    }
}
