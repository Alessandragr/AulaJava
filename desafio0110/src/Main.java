import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner (System.in);
    static Calculo calc = new Calculo();
    static double calculoIss=0;
    static double calculoIof=0;
    static double calculoIr=0;
    static char operacao;

    public static void main(String[] args) {
        boolean continua;
        do{        
            int op = menu();
            opcoesMenu(op);
            continua = retornaMenu();
        }while(continua);
        System.out.printf("\nO valor de todas as taxas cobradas foi de: %.4f de ISS, %.4f de IOF e %.4f de IR\n",
           calculoIss, calculoIof, calculoIr);
        System.out.println();
    }
    static int menu() {
        int opcao;
        do{
            System.out.println("\n=========== Calculadora de impostos ============\n");
            System.out.println("\t1 - Cálculo ISS\n\t2 - Cálculo IOF\n\t3 - Cálculo IR");
            System.out.println("===============================================");
            System.out.print("Escolha uma opcao do menu: ");
            opcao = Integer.parseInt(scan.nextLine()); 
            if(opcao <1 || opcao >3){
                System.out.println("Opcao invalida. Digite novamente!");
            }
        } while(opcao <1 || opcao >2);      

        return opcao;
    } static void opcoesMenu(int opcao){
        switch(opcao){
            case 1:
                System.out.println("============= Cálculo ISS ===============");
                double taxa1 = valorIss();
                calculoIss += taxa1;
                System.out.printf("O valor da taxa de ISS foi %.4f\n\n", taxa1);
            break;
            case 2:
                System.out.println("============= Cálculo IOF =============");
                char operacaoValida = operacaoIof();
                double taxa2 = valorIof(operacaoValida);
                calculoIof += taxa2;
                System.out.printf("\nO valor da taxa de IOF foi  %.2f\n\n", taxa2);
            break;
            case 3:
                System.out.println("============= Cálculo IR =============");
                double taxa3 = valorIr();
                calculoIr += taxa3;
                System.out.printf("\nO valor da taxa de IR foi  %.2f\n\n", taxa3);
            break;
        }
    } 
    static boolean retornaMenu(){
        boolean resposta = false;
        char resposta_continua;

        do{
            System.out.println("Deseja voltar ao menu? (S/N)");
            resposta_continua = scan.nextLine().toUpperCase().charAt(0);
            
            if(resposta_continua == 'S'){
                resposta = true;
            }
            else if(resposta_continua == 'N'){
                System.out.println("Até mais !!!");
            }
            else{
                System.out.println("Opção invalida! Digite (S/N)!");
            }
        }while(resposta_continua != 'S' && resposta_continua != 'N');

        return resposta;
    }
    static char operacaoIof(){
        
        char resp;

        do{
            System.out.println("Insira: C - para crédito\n\tS - para seguro\n\tM - para moeda");
            resp = scan.nextLine().toUpperCase().charAt(0);
            
            if(resp == 'C' || resp == 'S'|| resp=='M'){
                operacao = resp;
            }
            else{
                System.out.println("Opção invalida! Digite uma opção válida");
            }
        }while(resp != 'C' && resp != 'S' && resp !='M');

        return resp;    
    }
    
    static double valorIss(){
        System.out.print("Digite o valor a ser taxado: ");
        double valor  = Double.parseDouble(scan.nextLine());
        double taxa = calc.calculoIss(valor);
        return taxa;
    }
    static double valorIof(char operacao){
        
        System.out.print("Digite o valor a ser taxado: ");
        double valor2  = Double.parseDouble(scan.nextLine());
        double taxa = calc.calculoIof(valor2, operacao);
        return taxa;
    }
    static double valorIr(){
        System.out.print("Digite o valor a ser taxado: ");
        double valor  = Double.parseDouble(scan.nextLine());
        double taxa = calc.calculoIr(valor);
        return taxa;
    }

}
