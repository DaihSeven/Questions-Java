package draw4;

import javax.swing.*;
import java.awt.*;

public class DrawPlane2 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha um arco-íris
        int radius = 20;
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0: g.setColor(Color.RED); break;
                case 1: g.setColor(Color.ORANGE); break;
                case 2: g.setColor(Color.YELLOW); break;
                case 3: g.setColor(Color.GREEN); break;
                case 4: g.setColor(Color.BLUE); break;
                case 5: g.setColor(Color.CYAN); break;
                case 6: g.setColor(Color.MAGENTA); break;
            }
            g.fillArc(10, 10, radius, radius, 0, 180);
            radius += 20;
        }

        // Desenha uma casa colorida
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {100, 200, 150}, new int[] {100, 100, 50}, 3);
        g.setColor(Color.YELLOW);
        g.fillRect(130, 130, 40, 70);
    }
}
/**
 * código que desenha um arco-íris e uma casa colorida usando a biblioteca Swing do Java!
 *
 */