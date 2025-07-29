package vetores;

public class Main {
    public static void main(String[] args) {

        int[] n = new int[4];

        n[0] = 3;

        int[] n2 = {1, 2, 3, 4};

        System.out.println(n[0]);
        System.out.println(n2[0]);
        System.out.println(n2.length);

        System.out.println("===Primeiro loop===");
        for (int i = 0; i < n2.length; i++) {
            System.out.println(n2[i]);
        }

        System.out.println("===Segundo loop===");
        for (int j : n2) {
            System.out.println(j);
        }
    }
}
