package draw5;

import javax.swing.*;


public class DrawTest3 {
    public static void main(String[] args) {
        DrawPanel3 panel = new DrawPanel3();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
