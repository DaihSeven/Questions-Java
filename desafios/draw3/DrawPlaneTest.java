package draw3;

import draw3.DrawPanel;

import javax.swing.*;

public class DrawPlaneTest {

    public static void main(String[] args) {

        DrawPanel panel = new DrawPanel();

        JFrame application = new  JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250,250);
        application.setVisible(true);


    }
}
