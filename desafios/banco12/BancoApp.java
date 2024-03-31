package banco12;

import java.util.Scanner;

public class BancoApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Conta conta;

    public static void main(String[] args) {
        boolean executando = true;
        while (executando) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Conferir Saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    conferirSaldo();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }

    

    private static void cadastrarCliente() {
        scanner.nextLine(); 
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine(); 
        System.out.println("Digite a idade do cliente:");
        byte idade = scanner.nextByte(); 
        scanner.nextLine(); 
    System.out.println("Digite o número da conta:");
    int numero = scanner.nextInt();
    System.out.println("Digite o saldo inicial:");
    double saldo = scanner.nextDouble();
    scanner.nextLine(); 
    conta = new Conta(numero, saldo);
    conta.cliente = new Cliente(nome, idade);
    System.out.println("Cliente cadastrado com sucesso!");
}

private static void conferirSaldo() {
    if (conta != null) {
        System.out.println("Saldo atual: " + conta.getSaldo());
    } else {
        System.out.println("Nenhuma conta cadastrada.");
    }
}

private static void depositar() {
    if (conta != null) {
        System.out.println("Digite o valor para depósito:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso!");
    } else {
        System.out.println("Nenhuma conta cadastrada.");
    }
}

private static void sacar() {
    if (conta != null) {
        System.out.println("Digite o valor para saque:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha restante
        try {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    } else {
        System.out.println("Nenhuma conta cadastrada.");
    }
}

}
