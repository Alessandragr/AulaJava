package src;

import java.util.Scanner;

public class desafio4 {
    static Scanner scan = new Scanner(System.in);
    static byte opcao = 0;
    static char continua ='N';

    public static void main(String[] args) {
        titulo();
                      
    }
    static void titulo(){
        System.out.println("Seja bem-vindo(a) ao Bradesco financiamentos\n");
    }
    static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Crédito pessoal");
        System.out.println("2 - Crédito imobiliário");
        System.out.println("3 - Crédito empresarial");
        System.out.println("4 - Crédito consignado");
        
    }
    static byte ler_numero(String mensagem) {
        System.out.print(mensagem);
        byte numero = Byte.parseByte(scan.nextLine());
        return numero;
    }
    static void validacao() {
        boolean isValida = false;
        do {
            menu();
            validacao();
            escolha_menu();
                opcao =ler_numero("Insira a opção: ");

                if (isOpcao(opcao)) {
                    isValida=true;
                } else {
                    System.out.printf("Erro, opção inválida! \n");
                    isValida = false;
                }
        } while (!isValida);
    }
    static boolean isOpcao(byte value) {
        boolean valido = true;
        if(value<=0 || value>5) {
           valido = false;
        }
        return valido;  
        }
    static void escolha_menu() {
        do {
            
            switch(opcao) {
                case 1: 
                System.out.println("Crédito pessoal");
                break;
                case 2: 
                System.out.println("Crédito imobiliário");
                break;
                case 3:
                System.out.println("Crédito empresarial");
                break;
                case 4: 
                System.out.println("Crédito consignado");
                break;

            }
            if(opcao > 0 && opcao < 5 ){
                do{
                    System.out.print("Para voltar digite V e para sair digite S:");
                    continua = scan.nextLine().toUpperCase().charAt(0);   
                }while(continua!='V' && continua!='S');
            }
        } while(opcao < 0 || opcao > 5 ||continua=='V');

    scan.close();
    }
        
}