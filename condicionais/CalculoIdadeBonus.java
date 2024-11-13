package condicionais;

import java.util.Scanner;

public class CalculoIdadeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade atual: ");
        int idadeAtual = scanner.nextInt();

        int anoAtual = 2024; 

        // a) Cálculo do ano de nascimento
        int anoNascimento = anoAtual - idadeAtual;

        // b) Cálculo da idade em 2043
        int idadeEm2043 = idadeAtual + (2043 - anoAtual);

        // c) Idade em 2000
        int idadeEm2000 = (anoNascimento < 2000) ? idadeAtual - (2000 - anoNascimento) : 0;

        // d) Cálculo do bônus
        double bonus = (idadeEm2043 >= 30) ? 300.00 : 0.00;

        // Exibição dos resultados
        System.out.println("\nNome: " + nome);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Idade em 2043: " + idadeEm2043 + " anos");
        if (idadeEm2000 > 0) {
            System.out.println("Idade em 2000: " + idadeEm2000 + " anos");
        }
        System.out.println("Bônus: R$" + bonus);
    }
}
/*
 *  public static void main(String[] args) é a porta de entrada para o seu programa Java. É aqui que tudo começa!

public: Isso significa que o método main é público, ou seja, ele pode ser acessado de qualquer lugar dentro do seu programa.
static: Essa palavra-chave indica que o método main é estático, o que quer dizer que ele pertence à classe em si, e não a uma instância(como o operador new se cria um novo objeto ex: SerHumano Daiane = new SerHumano) específica da classe. Isso é crucial porque a JVM (Máquina Virtual Java) precisa chamar esse método sem criar um objeto da classe.
void: Aqui, void indica que o método main não retorna nenhum valor. Ele simplesmente executa as instruções dentro dele.
main: Este é o nome específico que a JVM procura quando você executa um programa Java. É o ponto de entrada do seu programa.
(String[] args): Essa parte define um parâmetro para o método main. É um array de strings chamado args que armazena quaisquer argumentos que você passar para o programa quando o executar na linha de comando.
 */