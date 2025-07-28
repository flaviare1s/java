package resolucaotela;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        System.out.println("A resolução da tela é: " + d.width + "x" + d.height);
    }
}
