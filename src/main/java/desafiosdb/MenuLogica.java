package desafiosdb;

import java.util.Scanner;

public class MenuLogica {

    public void controleMenu(){
        do{
            mostraMenu();
        }while(switchCase());
    }

    public void mostraMenu() {
        System.out.println("Digite o número correspondente a funcionalidade que gostaría de validar:");
        System.out.println("1. Qual a sua idade?");
        System.out.println("2. Catalogo de Bebidas");
        System.out.println("3. Descontos");
        System.out.println("4. Nota do Aluno");
        System.out.println("5. Calculadora");
        System.out.println("0. Sair");
    }

    public boolean switchCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nESCOLHA UMA OPÇÃO: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                QualSuaIdade idade = new QualSuaIdade();
                idade.qualSuaIdade();
                return true;

            case 2:
                CatalogoDeBebidas catalogo = new CatalogoDeBebidas();
                catalogo.controleMenuCatalogoBebidas();
                return true;

            case 3:
                Descontos descontos= new Descontos();
                descontos.descontos();
                return true;

            case 4:
                NotaDoAluno notadoAluno = new NotaDoAluno();
                notadoAluno.notaDoAluno();
                return true;

            case 5:
                Calculadora calculadora = new Calculadora();
                calculadora.calculadora();
                return true;


            case 0:
                return false;

            default:
                System.out.println("Opção inválida. Por favor, digite uma opção válida.");
                return true;
        }
    }

}
