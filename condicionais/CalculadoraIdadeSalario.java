package condicionais;

import java.util.Scanner;
/*
Import: Importa a classe Scanner para permitir a leitura de dados do usuário.
Declaração de variáveis: Declara as variáveis para armazenar o nome, idade, sexo, ano de nascimento e salário.
Leitura de dados: Utiliza o objeto Scanner para ler os dados do usuário.
 */
public class CalculadoraIdadeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
//Cálculo do ano de nascimento: Subtrai a idade do ano atual para obter o ano de nascimento.
        int anoNascimento = 2024 - idade; // Considerando o ano atual como 2024

//Cálculo do salário: Utiliza uma estrutura condicional if-else para verificar o sexo e atribuir o salário correspondente.
        double salario;
        if (sexo == 'M' || sexo == 'm') {
            salario = 300.00;
        } else if (sexo == 'F' || sexo == 'f') {
            salario = 500.00;
        } else {
            System.out.println("Sexo inválido. Por favor, digite M ou F.");
            return;
        }

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Salário: R$" + salario);
//Condicional para a mensagem: Verifica se a idade é maior ou igual a 18 e exibe a mensagem correspondente.
        if (idade >= 18) {
            System.out.println("Vá trabalhar!");
        } else {
            System.out.println("Estude!");
        }
        //Impressão dos resultados: Imprime na tela todas as informações calculadas.
    }
}
/*Explicação do código:

Import: Importa a classe Scanner para permitir a leitura de dados do usuário.
Declaração de variáveis: Declara as variáveis para armazenar o nome, idade, sexo, ano de nascimento e salário.
Leitura de dados: Utiliza o objeto Scanner para ler os dados do usuário.
Cálculo do ano de nascimento: Subtrai a idade do ano atual para obter o ano de nascimento.
Cálculo do salário: Utiliza uma estrutura condicional if-else para verificar o sexo e atribuir o salário correspondente.
Impressão dos resultados: Imprime na tela todas as informações calculadas.
Condicional para a mensagem: Verifica se a idade é maior ou igual a 18 e exibe a mensagem correspondente.
*/