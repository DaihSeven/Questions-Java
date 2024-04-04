package src.desafios2;

import javax.swing.JFrame;

public class ExemploFrame extends JFrame{
    public ExemploFrame(){
        super("Exemplo de Frame");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExemploFrame e = new ExemploFrame();
    }

}
