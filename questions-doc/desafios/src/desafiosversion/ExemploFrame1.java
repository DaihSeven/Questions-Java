package desafiosversion;

import javax.swing.JFrame;

public class ExemploFrame1 extends JFrame{

        public ExemploFrame1(){
            super("Exemplo de Frame");
            setSize(300, 100);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    
        public static void main(String[] args) {
            ExemploFrame1 e = new ExemploFrame1();
        }
    
    
}
