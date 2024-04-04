package diving8;


// Mergulhando

/*

Numa determinada competição de mergulho, cada mergulho tem um grau de dificuldade e é avaliado por sete juízes. Após cada salto, os juízes, que não se comunicam, mostram suas pontuações. Um mergulho é avaliado entre zero e dez por cada juiz. Após a apresentação das pontuações, as pontuações mais altas e mais baixas são descartadas. As restantes pontuações são somadas e a soma é multiplicada pelo grau de dificuldade do mergulho, que é um número entre 1,2 e 3,8 definido antes do mergulho. Assim, por exemplo, supondo que o salto de um mergulhador tenha dificuldade 2,0 e suas pontuações sejam 6,0, 5,0, 5,0, 5,0, 5,0, 5,0 e 4,0. Descartando as pontuações mais altas e mais baixas, chegamos ao resultado de 25,0. Este resultado é então multiplicado pelo grau de dificuldade 2,0 para uma pontuação final de 50,0. Seu programa deve exibir os resultados de uma competição seguindo estas regras.
Entrada
A primeira linha de entrada contém o número de mergulhadoresN (0 ≤ N ≤ 100). A seguir, o nome de cada competidor é seguido pelo grau de dificuldade D (1,2 ≤ D ≤ 3,8) do salto e, na linha seguinte, as sete notas S1 a S7 (0 ≤ S1 a S7 ≤ 10) dadas pelo juízes.
Saída
O resultado deverá mostrar o resultado da competição, com o nome de cada mergulhador seguido da pontuação final, na ordem em que os dados foram inseridos.
 
Amostra de entrada Amostra de saída
3
Gael
2,0
6,0 5,0 5,0 5,0 5,0 5,0 4,0
Marcos
1,5
8,5 7,0 8,0 8,0 8,4 7,5 7,7
Saulo
3,0
6,0 7,0 6,5 6,8 7,9 6,2 6,6 Gael 50,00
Marcos 59,40
Saulo 99h30

*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de mergulhadores:");
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o nome do mergulhador:");
            String nome = scanner.nextLine();
            System.out.println("Digite o grau de dificuldade do salto:");
            double D = scanner.nextDouble();
            double[] scores = new double[7];
            System.out.println("Digite as sete notas dadas pelos juízes:");
            for (int j = 0; j < 7; j++) {
                scores[j] = scanner.nextDouble();
            }
            scanner.nextLine();
            Arrays.sort(scores);
            double total = 0;
            for (int j = 1; j < 6; j++) {
                total += scores[j];
            }
            total *= D;
            System.out.printf("%s %.2f\n", nome, total);
        }
        scanner.close();
    }
}

