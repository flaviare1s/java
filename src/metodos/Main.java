package metodos;

public class Main {

    static void soma(int a, int b) {
        int s = a + b;
        System.out.println(s);
    }

    static int somar(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
       soma(5, 2);
        System.out.println(somar(7, 7));
    }
}
