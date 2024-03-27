/** Tentativa de fazer o símbolo do java
 *
 */
package draw5;

import javax.swing.*;
import java.awt.*;

public class DrawPanel3  extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha a "xícara" azul
        g.setColor(Color.BLUE);
        g.fillRoundRect(50, 100, 100, 50, 20, 20);
        g.setColor(Color.WHITE);
        g.fillRoundRect(70, 110, 60, 30, 20, 20);

        // Desenha a "fumaça" vermelha
        g.setColor(Color.RED);
        g.fillOval(70, 50, 60, 60);
        g.fillOval(50, 60, 60, 60);
        g.fillOval(90, 60, 60, 60);
    }
}
