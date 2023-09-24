package desafiosDB;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número correspondente a funcionalidade que gostaría de validar?");
        System.out.println("1. Qual a sua idade?");
        System.out.println("2. Catalogo de Bebidas");
        System.out.println("3. Descontos");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                QualSuaIdade idade = new QualSuaIdade();
                idade.qualSuaIdade();
                break;

            case 2:
                CatalogoDeBebidas catalogo = new CatalogoDeBebidas();
                catalogo.catalogoDeBebidas();
                break;

            case 3:
                Descontos descontos= new Descontos();
                descontos.descontos();
                break;

          }

    }
}