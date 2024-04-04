package catalog17;

import java.util.Scanner;

public class CatalogSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Catalog catalog = new Catalog();
        User user = new User("Usuário 1");

        catalog.addObserver(user);

        while(true) {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Visualizar catálogo");
            System.out.println("3. Selecionar produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String name = scanner.nextLine();
                    System.out.print("Digite a descrição do produto: ");
                    String description = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    catalog.addProduct(name, description, price);
                    break;
                case 2:
                    catalog.viewCatalog();
                    break;
                case 3:
                    System.out.print("Digite o índice do produto: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    Product product = catalog.selectProduct(index);
                    System.out.println("Produto selecionado: " + product);
                    break;
                case 4:
                    System.out.println("Programa Encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
/*Este código permite que você adicione vários produtos ao catálogo, visualize o catálogo e selecione itens do catálogo. As instruções de entrada para o que deve ser digitado são fornecidas antes de cada entrada do usuário. Por favor, note que a seleção do produto é feita através do índice do produto no catálogo. O primeiro produto tem índice 0, o segundo produto tem índice 1, e assim por diante. Se o índice fornecido estiver fora do intervalo, uma exceção será lançada. */