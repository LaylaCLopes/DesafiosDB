package desafiosdb;

        /*Faça um programa que auxilie o cálculo das notas finais dos alunos, assim agilizando o resultado para o professor.

        As regras para o cálculo são essas abaixo:

        O programa deverá receber 3 notas do aluno.
        Se a média for maior ou igual a 7, o programa deverá exibir na tela "Aprovado".
        Se a média for maior ou igual a 5, o programa deverá exibir na tela "Recuperação".
        Se a média for menor que 5, o programa deverá exibir na tela "Reprovado".
         */

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
