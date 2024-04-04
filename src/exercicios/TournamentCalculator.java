package src.exercicios;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class TournamentCalculator {
    private JFrame frame;
    private JTextField masterKungField;
    private JTextField masterLuField;
    private JButton calculateButton;
    private JLabel instructionLabel;
    private JLabel resultLabel;

    public TournamentCalculator() {
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
                new TournamentCalculator();
            }
        });
    }
}
