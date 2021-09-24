package src;

import java.util.Scanner;

public class desafio2 {

    static Scanner scan = new Scanner(System.in);

    static double salario =0;

    public static void main(String[] args) {
        nomePrograma();
        validacao();
        
    }
    static void nomePrograma() {
        System.out.println("#### Verifica Salário ####");
    }
    static Double leitura (String mensagem) {
        System.out.print(mensagem);
        salario = Double.parseDouble(scan.nextLine());
        return salario;
    }
    static void validacao() {
        boolean isValida = true;
        double salario = 0;

        do {
                salario =leitura("Olá! Informe seu salário: ");

                if (isSalario(salario)) {
                    validacaoSalario();
                    isValida=true;
                } else {
                    System.out.printf("Erro, salário tem que ser maior do que 0! \n");
                    isValida = false;
                }
        } while (!isValida) ;
    }

static void validacaoSalario() {
        if (salario>1997.58 && salario<5399.99) {
            System.out.println("Olá, seu salário está entre R$1997.58 e R$5399.99!");
        } else if (salario>=5399.99) {
            System.out.println("Olá, seu salário é superior a R$5399.99!");
        } else if(salario>0 && salario<1997.58) {
            System.out.println("Olá, seu salário é inferior a R$1997.58!");
        } 
    }
    static boolean isSalario(double value) {
        boolean valido = true;
        if(value<=0) {
           valido = false;
        }
        return valido;
        
    }

}