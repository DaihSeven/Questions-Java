/*- Cabeça ou cauda
================================================= ==

John e Mary são amigos desde a creche. Desde então, eles compartilham uma rotina lúdica: sempre que se encontram, jogam Cara ou Coroa com uma moeda, e quem ganha tem o privilégio de decidir o que vai jogar durante o dia. Mary sempre escolhe Cabeça e John sempre escolhe Cauda.
Hoje eles estão na faculdade, mas continuam sendo bons amigos. Sempre que se encontram, eles ainda jogam Head and Tail, e o vencedor decide qual filme assistir, ou em qual restaurante jantar juntos, e assim por diante.
Ontem Mary confidenciou a John que ela mantém um registro dos resultados de todas as peças desde que começaram, na creche. Foi uma surpresa para John! Mas como John está estudando Ciência da Computação, ele decidiu que era uma boa oportunidade para mostrar a Mary suas habilidades em programação, escrevendo um programa para determinar o número de vezes que cada um deles ganhou o jogo ao longo dos anos.

Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém um único inteiro N indicando o número de jogos disputados (1 ≤ N ≤ 10.000). A linha a seguir contém N inteiros Ri, separados por espaço, descrevendo a lista de resultados. Se Ri = 0 significa que Maria ganhou o i-ésimo jogo, se Ri = 1 significa que João ganhou o i-ésimo jogo (1 ≤ i ≤ N). O final da entrada é indicado por N = 0.

Saída
Para cada caso de teste na entrada seu programa deve gerar uma linha contendo a sentença “Mary ganhou X vezes e John ganhou Y vezes”, onde 0 ≤ X e 0 ≤ Y.

-------------------------------------------------- -------------
| Amostra de entrada | Amostra de saída |
-------------------------------------------------- -------------
| 5 | Maria ganhou 3 vezes e João ganhou 2 vezes |
| 0 0 1 0 1 | Mary ganhou 5 vezes e John ganhou 1 vez |
| 6 | |
| 0 0 0 0 0 1 | |
| 0 | |
-------------------------------------------------- ------------- */

package src.exercicios;

import java.util.Scanner;

public class HeadOrTail15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de jogos:");
        int N = scanner.nextInt(); 
        
        while (N != 0) {
            int maryWins = 0;
            int johnWins = 0;
            
            System.out.println("Digite os resultados dos jogos (0 para vitória de Mary, 1 para vitória de John):");
            for (int i = 0; i < N; i++) {
                int result = scanner.nextInt(); 
                if (result == 0) {
                    maryWins++; 
                } else {
                    johnWins++; 
                }
            }
            
            System.out.println("Mary ganhou " + maryWins + " vezes e John ganhou " + johnWins + " vezes");
            System.out.println("Digite o número de jogos para o próximo caso de teste (ou 0 para encerrar):");
            N = scanner.nextInt(); // Lê o número de jogos para o próximo caso de teste
        }
        
        scanner.close();
    }
}


