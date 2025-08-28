package joptionpane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Entrada de dados via JOptionPane
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
        JOptionPane.showMessageDialog(null, "A pessoa tem " + idade + " anos de idade!");
    }
}
