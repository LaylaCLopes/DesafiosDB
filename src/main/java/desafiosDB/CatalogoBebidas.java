package desafiosDB;


import java.util.Scanner;

public class CatalogoBebidas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Mercado da Layla!");
        System.out.println("Selecione o tipo de bebida:");
        System.out.println("1. Cerveja");
        System.out.println("2. Refrigerante");
        System.out.println("3. Água");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu cerveja.");
                System.out.println("Por favor, informe sua idade:");
                int idade = scanner.nextInt();

                if (idade >= 18) {
                    System.out.println("Compra efetuada com sucesso.");
                } else {
                    System.out.println("Compra negada. Você é menor de idade.");
                }
                break;
            case 2:
                System.out.println("Você escolheu refrigerante.");
                System.out.println("Compra efetuada com sucesso.");
                break;
            case 3:
                System.out.println("Você escolheu água.");
                System.out.println("Compra efetuada com sucesso.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }
}




