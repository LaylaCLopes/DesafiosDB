package desafiosdb;

        /*Você deve escrever um programa de console para um mercado que irá registrar as compras dos clientes e conceder um desconto de acordo com a quantidade de itens comprados.
        Cada produto informado deve ter: nome, preço e quantidade.
        O sistema deve ler a informação do produto e calcular o valor total a ser pago considerando as seguintes regras de desconto:

        a. Até 10 unidades: valor total
        b. De 11 a 20 unidades: 10% de desconto
        c. De 21 a 50 unidades: 20% de desconto
        d. Acima de 50 unidades: 25% de desconto
        */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Descontos {
    float valor;

    public void descontos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.next();

        System.out.print("Digite o valor do produto: ");

        //Utilizado caso dê erro de numero, utilizando separador com ponto
        try {
            valor = scanner.nextFloat();
        }  catch (InputMismatchException err) {
            System.out.println("Erro! O valor digitado precisa ser NUMERO e deve ser separado por vírgula. Tente novamente!");
        }

        System.out.print("Digite a quantidade de itens: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 10){
            System.out.println("Produto: "+produto+" \nValor: " +(valor*quantidade) + "\n");
        }else if (quantidade <= 20){
            System.out.println("Produto: "+produto+" \nValor: " + ((valor*quantidade)*0.9) + "\n");
        }else if (quantidade <= 50) {
            System.out.println("Produto: " + produto + " \nValor: " + ((valor * quantidade) * 0.8) + "\n");
        }else {
            System.out.println("Produto: " + produto + " \nValor: " + ((valor * quantidade) * 0.75) + "\n");
        }


    }

}
