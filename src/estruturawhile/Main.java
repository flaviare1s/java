package estruturawhile;

public class Main {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 10) {
            i++;
            if (i == 5 || i == 7) {
                continue;
            }

            if (i == 9) {
                break;
            }
            System.out.println("Cambalhota " + i);
        }
    }
}
