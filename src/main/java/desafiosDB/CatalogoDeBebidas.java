package desafiosDB;
/*
Você irá escrever um programa de console para um mercado que vende apenas tres tipos de bebida:
 cerveja, refrigerante e água.
 O programa deve perguntar qual tipo de bebida a pessoa deseja comprar e
 caso ela opte pela cerveja o programa deve perguntar a idade da pessoa.
 Caso a pessoa seja menor de idade deve printar "compra negada".
 Em todos os outros casos deve printar "compra efetuada com sucesso".
 */

import java.util.Scanner;

public class CatalogoDeBebidas {

    public void controleMenuCatalogoBebidas(){
        do{
            mostraMenuCatalogoBebidas();
        }while(switchCase());
    }

    public void mostraMenuCatalogoBebidas() {
        System.out.println("\nBem-vindo ao Mercado da Layla!");
        System.out.println("Selecione o tipo de bebida:");
        System.out.println("1. Cerveja");
        System.out.println("2. Refrigerante");
        System.out.println("3. Água");
        System.out.println("0. SAIR");
    }

    public boolean switchCase() {
        Scanner scanner = new Scanner(System.in);
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
                return true;
            case 2:
                System.out.println("Você escolheu refrigerante.");
                System.out.println("Compra efetuada com sucesso.");
                return true;
            case 3:
                System.out.println("Você escolheu água.");
                System.out.println("Compra efetuada com sucesso.");
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opção inválida. Por favor, digite uma opção válida.");
                return true;
        }
    }
}

