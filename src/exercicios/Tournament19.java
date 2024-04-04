/**
 * Copa
 * ====================================================
 *
 * O sorteio das posições dos jogadores na chave decisiva da copa do mundo de ping-pong está deixando a todos nervosos.
 * É que ninguém quer pegar o jogador mais bem ranqueado, o Mestre Kung, logo nas oitavas de final, ou nas quartas de final.
 * Melhor que só seja possível enfrentar Mestre Kung na semifinal ou na final!
 * A chave possui 16 posições numeradas de 1 a 16, como na figura abaixo. A organização da copa vai fazer um sorteio para
 * definir em qual posição cada jogador vai iniciar a chave decisiva. Nas oitavas de final, o jogador na posição 1 enfrenta
 * o jogador na posição 2; o da posição 3 enfrenta o da posição 4; e assim por diante, como na figura: tournament.png.
 * O objetivo deste problema é, dadas as posições de Mestre Kung e Mestre Lu na chave, decidir em que fase da competição
 * Mestre Kung e Mestre Lu vão se enfrentar, caso vençam todas as suas respectivas partidas antes de se enfrentarem.
 * Por exemplo, se o sorteio da chave determinar que Mestre Kung ocupará a posição 1 e Mestre Lu a posição 2 da chave,
 * eles se encontrarão nas oitavas de final; se Mestre Kung ocupar a posição 6 e Mestre Kung ocupar a posição 9 da chave,
 * eles se encontrarão somente na final.
 *
 * Entrada
 * A entrada consiste de duas linhas. A primeira linha da entrada contém um inteiro K (1 ≤ K ≤ 16) que indica
 * a posição de Mestre Kung na chave. A segunda linha da entrada contém um inteiro L (1 ≤ L ≤ 16, K \(\ne \) L)
 * que indica a posição de Mestre Lu na chave.
 *
 * Saída
 * Seu programa deve produzir uma linha contendo uma das palavras seguintes, decidindo a fase em que vão se enfrentar
 * os jogadores Mestre Kung e Mestre Lu, se eles chegarem a se enfrentar: oitavas, quartas, semifinal ou final.
 *
 * --------------------------------------------
 * | Exemplo de Entrada | Exemplo de Saída    |
 * --------------------------------------------
 * | 10                 | semifinal           |
 * | 14                 |                     |
 * --------------------------------------------
 * | 7                  | oitavas             |
 * | 8                  |                     |
 * --------------------------------------------
 * | 3                  | final               |
 * | 13                 |                     |
 * --------------------------------------------
 * | 5                  | quartas             |
 * | 8                  |                     |
 * --------------------------------------------
 * 
 */
package src.exercicios;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class Tournament19 {
    private JFrame frame;
    private JTextField masterKungField;
    private JTextField masterLuField;
    private JButton calculateButton;
    private JLabel instructionLabel;
    private JLabel resultLabel;

    public Tournament19() {
        frame = new JFrame("Tournament Round Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        instructionLabel = new JLabel("Digite os números de Master Kung e Master Lu:");
        masterKungField = new JTextField();
        masterLuField = new JTextField();
        calculateButton = new JButton("Calcular Rodada");
        resultLabel = new JLabel("Resultado: ");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int masterKung = Integer.parseInt(masterKungField.getText());
                    int masterLu = Integer.parseInt(masterLuField.getText());
                    String round = calculateRound(masterKung, masterLu);
                    resultLabel.setText("Resultado: " + round);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, insira números válidos.");
                }
            }
        });

        frame.add(instructionLabel);
        frame.add(masterKungField);
        frame.add(masterLuField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    public String calculateRound(int masterKung, int masterLu) {
        String round = "";

        if ((masterKung % 2) != 0) {
            if ((masterLu - masterKung) == 1) {
                round = "oitavas";
            } else if ((masterLu - masterKung) <= 3) {
                round = "quartas";
            } else if ((masterLu - masterKung) <= 8) {
                round = "semifinal";
            } else {
                round = "final";
            }
        } else {
            if ((masterLu - masterKung) <= 2) {
                round = "quartas";
            } else if ((masterLu - masterKung) <= 8) {
                round = "semifinal";
            } else {
                round = "final";
            }
        }
        return round;
    }

    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Tournament19();
            }
        });
    }
}

