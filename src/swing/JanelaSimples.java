package swing;

import javax.swing.*;

public class JanelaSimples {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello World");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(null);

            JLabel label = new JLabel("Hello, World!");
            label.setBounds(160, 30, 200, 30);
            frame.add(label);

            JButton botao = new JButton("Clique aqui");
            botao.setBounds(140, 80, 120, 30);
            frame.add(botao);

            botao.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "Hello, Swing!");
            });

            frame.setVisible(true);
        });
    }
}
