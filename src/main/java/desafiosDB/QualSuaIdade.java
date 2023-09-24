package desafiosDB;

import java.util.Scanner;

public class QualSuaIdade {
    public void qualSuaIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }


    }
}
