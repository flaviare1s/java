package foreach;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 6, 9, 22, 4};

        for (int n: num) {
            System.out.println(n);
        }

        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        for (String mes: meses) {
            System.out.println(mes);
        }
    }
}
