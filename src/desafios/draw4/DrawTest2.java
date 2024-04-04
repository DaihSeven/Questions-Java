package draw4;

import draw4.DrawPlane2;

import javax.swing.*;

public class DrawTest2 {
    public static void main(String[] args) {
        DrawPlane2 panel = new DrawPlane2();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
