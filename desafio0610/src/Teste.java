import java.util.Random;
import java.util.Scanner;

public class Teste {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();

        int qtd =1;
        double saldoFinal=0;
        double saldoFinalConta =0;

        c.setSaldo(ler_numero("Informe seu saldo:"));
        double saldoInicial = c.getSaldo();
        c.setCodigoCliente(random.nextInt(10000));
        cc.setSaldo(ler_numero("Informe seu saldo da cc:"));
        double saldoInicialCc = cc.getSaldo();
        cc.setCodigoCliente(random.nextInt(10000));

        do {
            qtd++;
            int opcao = (int)ler_numero("1 - para transferir da conta poupança\n2 - para transferir da conta corrente\nInsira sua opção: \n");
            if(opcao==1) {
               c.transferencia(ler_numero("Digite o valor a ser transferido:\n"));
            } else if (opcao==2) {
                cc.transferencia(ler_numero("Digite o valor a ser transferido: \n"));
            } else {
                System.out.println("\nOpção inválida!");
            }
            saldoFinalConta += saldoFinalConta;
            
        } while (qtd<6);
        System.out.println("-------------Conta----------------");
        System.out.printf("Codigo do cliente: %s\nSaldo: %.2f\nNovo saldo: %.2f", c.getCodigoCliente(), saldoInicial,c.getSaldo()) ;
        System.out.println("-------------Conta Corrente----------------");
        System.out.printf("\nCodigo do cliente: %s\nSaldo: %.2f\nNovo saldo: %.2f", cc.getCodigoCliente(), saldoInicialCc, cc.getSaldo());
    }
    static double ler_numero(String mensagem) {
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine());
        return numero;
    }
        
}
