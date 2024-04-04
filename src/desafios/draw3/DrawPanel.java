package draw3;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int width = getWidth();

        int height = getHeight();

        g.drawLine(0,0,width,height);

        g.drawLine(0, height, width, 0);

    }

}
/**
 Este código Java é um programa simples de desenho gráfico que usa a biblioteca Swing para criar uma janela e desenhar duas linhas na tela.

 Aqui está o que cada parte do código faz:

 DrawPlaneTest: Esta é a classe principal que contém o método main(). Este método é o ponto de entrada para o programa.
 DrawPanel panel = new DrawPanel();: Aqui, um novo objeto DrawPanel é criado. DrawPanel é uma subclasse de JPanel, que é um tipo de contêiner em Swing que pode conter outros componentes Swing.
 JFrame application = new JFrame();: Aqui, um novo objeto JFrame é criado. JFrame é uma janela com uma barra de título e um botão de fechamento.
 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);: Isso faz com que o programa termine quando a janela do JFrame é fechada.
 application.add(panel);: Isso adiciona o DrawPanel ao JFrame.
 application.setSize(250,250);: Isso define o tamanho da janela para 250x250 pixels.
 application.setVisible(true);: Isso torna a janela visível.

 Na classe DrawPanel:

 paintComponent(Graphics g): Este método é chamado automaticamente sempre que o Swing precisa desenhar o componente. O objeto Graphics passado para ele é usado para desenhar na tela.
 g.drawLine(0,0,width,height); e g.drawLine(0, height, width, 0);: Estas linhas de código desenham duas linhas diagonais na tela.
 **/