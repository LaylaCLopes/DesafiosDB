package desafiosDB;

import java.util.Scanner;

public class Descontos {
    public void descontos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = scanner.next();

        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.println("Digite a quantidade de itens");
        int quantidade = scanner.nextInt();

        if (quantidade <= 10){
            System.out.println("Produto: "+produto+" Valor: " +(valor*quantidade));
        }else if (quantidade <= 20){
            System.out.println("Produto: "+produto+" Valor: " + ((valor*quantidade)*0.9));
        }else if (quantidade <= 50) {
            System.out.println("Produto: " + produto + " Valor: " + ((valor * quantidade) * 0.8));
        }else {
            System.out.println("Produto: " + produto + " Valor: " + ((valor * quantidade) * 0.75));
        }


    }

}
