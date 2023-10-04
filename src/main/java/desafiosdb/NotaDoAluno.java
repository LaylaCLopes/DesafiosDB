package desafiosdb;

import java.util.Scanner;

public class NotaDoAluno {
    public void notaDoAluno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda do aluno: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira do aluno: ");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3)/ 3;


        if (media >= 7) {
            System.out.println("Aluno está aprovado\n");
        } else if (media >= 5){
            System.out.println("Aluno está em recuperação\n");
        }
        else {
            System.out.println("Aluno está reprovado\n");
        }

    }
}
