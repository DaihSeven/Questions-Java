package desafiosversion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class CalculadoraSofisticada3 extends JFrame {
    private JTextField tela; 
    private double valor1, valor2, resultado; 
    private String operador; 
    private JButton[] botoes; 

    public CalculadoraSofisticada3() {
        super("Calculadora Sofisticada"); 
        botoes = new JButton[17]; 
        iniciarComponentes(); 
        definirLayout(); 
        setSize(400, 400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
    }

    private void iniciarComponentes() {
        tela = new JTextField();
        tela.setEditable(false);
        tela.setHorizontalAlignment(JTextField.RIGHT);
        tela.setFont(new Font("Arial", Font.BOLD, 20));

        String[] textosBotoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C"
        };

        for (int i = 0; i < botoes.length; i++) {
            botoes[i] = new JButton(textosBotoes[i]);
            botoes[i].setFont(new Font("Arial", Font.BOLD, 20));
            if (i % 4 == 3) {
                botoes[i].setBackground(Color.ORANGE);
            } else {
                botoes[i].setBackground(Color.BLUE);
            }
            botoes[i].setForeground(Color.WHITE);
            botoes[i].addActionListener(new ActionListenerBotao());
        }
    }

    private void definirLayout() {
        setLayout(new BorderLayout());
        add(tela, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(5, 4));

        for (JButton botao : botoes) {
            painelBotoes.add(botao);
        }

        add(painelBotoes, BorderLayout.CENTER);
    }
    private class ActionListenerBotao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = ((JButton) e.getSource()).getText();
            if (entrada.charAt(0) >= '0' && entrada.charAt(0) <= '9' || entrada.equals(".")) {
                tela.setText(tela.getText() + entrada);
            } else if (entrada.equals("=")) {
                valor2 = Double.parseDouble(tela.getText());
                calcularResultado();
                tela.setText(String.valueOf(resultado));
            } else if (entrada.equals("C")) {
                tela.setText("");
                valor1 = 0;
                valor2 = 0;
                resultado = 0;
                operador = "";
            } else {
                valor1 = Double.parseDouble(tela.getText());
                operador = entrada;
                tela.setText("");
            }
        }
    }

    private void calcularResultado() {
        switch (operador) {
            case "+": resultado = valor1 + valor2; break;
            case "-": resultado = valor1 - valor2; break;
            case "*": resultado = valor1 * valor2; break;
            case "/": resultado = valor1 / valor2; break;
        }
    }

    public static void main(String[] args) {
        new CalculadoraSofisticada3();
    } 
}

