package src;

import java.util.Scanner;

public class desafio1 {
    static byte idade =0;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        nomePrograma();
        leitura("Olá! Informe sua idade: ");
        validacaoIdade();
    }
    static void nomePrograma() {
        System.out.println("#### Verifica Idade ####");
    }
        static byte leitura (String mensagem) {
        System.out.print(mensagem);
        idade = Byte.parseByte(scan.nextLine());
        return idade;
    }

static void validacaoIdade() {
    if (idade>25) {
        System.out.println("Olá, você tem mais de 25 anos!");
    } else if (idade==25) {
        System.out.println("Olá, você tem 25 anos!");
    } else if (idade<25) {
        System.out.println("Olá, você tem menos de 25 anos!");

    }
}
}
