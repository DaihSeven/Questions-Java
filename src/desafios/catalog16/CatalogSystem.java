/*Implementando um Catálogo de Produtos com Padrão Observer
========================================================

Descrição
Você deve aprimorar o sistema de monitoramento de produtos, adicionando a capacidade de exibir uma mensagem específica para cada usuário quando um novo produto é adicionado ao catálogo. Além disso, implemente a funcionalidade de permitir que os usuários cancelem sua assinatura para deixar de receber notificações sobre novos produtos.

Entrada
O programa deve solicitar ao usuário que insira o nome do usuário para realizar a ação desejada.
Se o usuário deseja cancelar a assinatura, ele deve digitar "cancelar". Se desejar receber notificações, deve digitar qualquer outro valor.
Se o usuário optar por adicionar um novo produto, será solicitado o nome do produto a ser adicionado.
Saída
Após cada ação, o programa deve exibir mensagens informativas para indicar se a assinatura foi cancelada com sucesso, se o usuário ainda está assinando notificações ou se o produto foi adicionado ao catálogo.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

---------------------------------------------------------------------------
| Entrada    |  Saída                                                     |
---------------------------------------------------------------------------
| TV         | Notificacao recebida: Novo produto adicionado - TV         |
| Smart      |                                                            |
| 999        |                                                            |
| S          |                                                            |
---------------------------------------------------------------------------
| Smartphone | Notificacao recebida: Novo produto adicionado - Smartphone |
| Apple      |                                                            |
| 3000       |                                                            |
| S          |                                                            |
---------------------------------------------------------------------------
| Mouse      | Programa Encerrado.                                        |
| Sem fio    |                                                            |
| 340        |                                                            |
| N          |                                                            |
--------------------------------------------------------------------------- */
package catalog16;

import java.util.Scanner;

public class CatalogSystem {
    public static void main(String[] aargs) {
        Scanner scanner = new Scanner(System.in);

        Catalog catalog = new Catalog();
        User user = new User("Usuário 1");

        catalog.addObserver(user);

        String name = scanner.nextLine();
        String description = scanner.nextLine();
        double price = scanner.nextDouble();

        scanner.nextLine();
        String subscribeChoice = scanner.nextLine();
        
        scanner.close();
       
        catalog.addProduct(name, description, price, subscribeChoice);
    }
}

/*O código Java implementa um padrão de design chamado Observer, que é usado para criar um sistema de notificação. O código pede ao usuário para inserir informações sobre um produto e, dependendo da escolha do usuário, notifica os observadores (neste caso, um usuário) sobre o novo produto adicionado ou encerra o programa. Aqui está o que cada parte do código faz:

Interface Observer: Define um método update, que é chamado quando um produto é adicionado.
Classe User: Implementa a interface Observer e define como o usuário é notificado.
Interface CatalogObservable: Define métodos para adicionar e remover observadores, além de notificá-los.
Classe Catalog: Implementa CatalogObservable e gerencia a lista de observadores. Notifica os observadores quando um produto é adicionado.
Classe CatalogSystem: Contém o método main que executa o programa. Ele cria um Catalog, adiciona um User como observador, lê as informações do produto e a escolha de subscrição do usuário, e então chama addProduct.
O usuário é solicitado a inserir:

O nome do produto.
A descrição do produto.
O preço do produto.
Uma escolha de subscrição (S para notificar sobre o novo produto, qualquer outra coisa para encerrar o programa).
Se o usuário digitar S após inserir as informações do produto, o observador (User) será notificado com uma mensagem sobre o novo produto. Se qualquer outra coisa for digitada, o programa imprimirá “Programa Encerrado.” e terminará.

Aqui está um exemplo de como o usuário interagiria com o programa no terminal:

Nome do Produto
Descrição do Produto
Preço do Produto
S

Se S for digitado, o usuário receberá uma notificação como esta:

Notificacao recebida: Novo produto adicionado - Nome do Produto

Se qualquer outra coisa for digitada, o programa simplesmente terminará com a mensagem “Programa Encerrado.”. */