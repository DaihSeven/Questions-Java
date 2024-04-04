/*18) Diferença entre dígitos 
================================================ 
===== 
Desafio O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma de seus dígitos. 
Entrada 
- Para encontrar o produto do valor, os dígitos devem ser multiplicados. 
- A soma, basta somar os dígitos. - Para a diferença é necessário subtrair o resultado final dos dois valores. 
Saída 
- A saída deve retornar o valor final da diferença entre o produto e a soma dos dígitos. 
Exemplo
| Input	| Output |
|-------|--------|
| 243   | 15     |
| 1521  | 1      |  

*/

package exercicios;

import java.util.Scanner;

public class DifferenceDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro (ou -1 para sair):");

        while(true) {
            int num = scan.nextInt();
            
            if(num == -1) {
                break;
            }
            
            int product = 1;
            int sum = 0;
            
            while(num > 0) {
                int numAux = num % 10;
                product *= numAux;
                sum += numAux;
                num /= 10;
            }
            
            int difference = product - sum;
            System.out.println("A diferença entre o produto e a soma dos dígitos é: " + difference);
            System.out.println("Digite outro número inteiro (ou -1 para sair):");
        }

        scan.close();
        System.out.println("Programa encerrado.");
    }
}

