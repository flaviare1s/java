package arrays3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] paises = new String[4];
        for (int i = 0; i < 4; i++) {
            paises[i] = JOptionPane.showInputDialog("Iforme um país");
        }

        for (String pais: paises) {
            System.out.println(pais);
        }
    }
}
