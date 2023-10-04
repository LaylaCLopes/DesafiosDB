package desafiosdb;

import java.util.Scanner;

public class QualSuaIdade {
    public void qualSuaIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade\n");
        }else {
            System.out.println("Você é menor de idade\n");

        }


    }
}
