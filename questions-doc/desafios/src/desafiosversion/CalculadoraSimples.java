package desafiosversion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*for (int i = 0; i < botoes.length; i++) {
            botoes[i] = new JButton();
        } */
        public class CalculadoraSimples extends JFrame {
            private JTextField tela; // Campo de texto para exibir os números e resultados
            private double valor1, valor2, resultado; // Variáveis para armazenar os valores e o resultado
            private String operador; // String para armazenar o operador da operação
            private JButton[] botoes; // Array para armazenar os botões da calculadora
        
            public CalculadoraSimples() {
                super("Calculadora Simples"); // Título da janela da calculadora
                botoes = new JButton[16]; // Inicialização do array de botões com 16 posições
                iniciarComponentes(); // Método para inicializar os componentes da calculadora
                definirLayout(); // Método para definir o layout da calculadora
                setSize(300, 300); // Define o tamanho da janela da calculadora
                setDefaultCloseOperation(EXIT_ON_CLOSE); // Define a operação padrão de fechamento
                setVisible(true); // Torna a janela visível
            }
        
            private void iniciarComponentes() {
                tela = new JTextField();
                tela.setEditable(false);
                tela.setHorizontalAlignment(JTextField.RIGHT);
        
                // Inicializa os botões com seus respectivos textos
                String[] textosBotoes = {
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", ".", "=", "+"
                };
        
                for (int i = 0; i < botoes.length; i++) {
                    botoes[i] = new JButton(textosBotoes[i]);
                    botoes[i].addActionListener(new ActionListenerBotao());
                }
            }
        
            private void definirLayout() {
                setLayout(new BorderLayout());
                add(tela, BorderLayout.NORTH);
        
                JPanel painelBotoes = new JPanel();
                painelBotoes.setLayout(new GridLayout(4, 4));
                // Adiciona os botões ao painel
                for (JButton botao : botoes) {
                    painelBotoes.add(botao);
                }
        
                add(painelBotoes, BorderLayout.CENTER);
            }
        
            // Classe interna para lidar com eventos de ação dos botões
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
                    } else {
                        valor1 = Double.parseDouble(tela.getText());
                        operador = entrada;
                        tela.setText("");
                    }
                }
            }
        
            // Método para calcular o resultado com base no operador
            private void calcularResultado() {
                switch (operador) {
                    case "+": resultado = valor1 + valor2; break;
                    case "-": resultado = valor1 - valor2; break;
                    case "*": resultado = valor1 * valor2; break;
                    case "/": resultado = valor1 / valor2; break;
                }
            }
        
            public static void main(String[] args) {
                new CalculadoraSimples();
            }
        }