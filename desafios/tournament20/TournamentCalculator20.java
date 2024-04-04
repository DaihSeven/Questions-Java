package tournament20;

import java.io.IOException;

import javax.swing.SwingUtilities;

import exercicios.TournamentCalculator;

public class TournamentCalculator20 {
    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TournamentCalculator();
            }
        });
    }

}
