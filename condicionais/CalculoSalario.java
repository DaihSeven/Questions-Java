import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        // Cálculo do aumento com base no salário atual
        double aumento;
        if (salarioAtual >= 3000) {
            aumento = salarioAtual * 0.20; // 20% de aumento
        } else if (salarioAtual >= 2000) {
            aumento = salarioAtual * 0.25; // 25% de aumento
        } else {
            aumento = salarioAtual * 0.30; // 30% de aumento
        }

        // Cálculo do novo salário
        double novoSalario = salarioAtual + aumento;

        // Cálculo dos descontos (19% do novo salário)
        double descontos = novoSalario * 0.19;

        // Cálculo do salário final
        double salarioFinal = novoSalario - descontos;

        // Exibição dos resultados
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário atual: R$" + salarioAtual);
        System.out.println("Aumento: R$" + aumento);
        System.out.println("Novo salário: R$" + novoSalario);
        System.out.println("Descontos: R$" + descontos);
        System.out.println("Salário final: R$" + salarioFinal);
    }
}