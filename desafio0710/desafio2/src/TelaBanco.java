import java.util.Random;
import java.util.Scanner;

public class TelaBanco {

    static Scanner scan = new Scanner();
    public static void main(String[] args) {
        Random random = new Random();

        ContaCorrente cc = new ContaCorrente();
                
        cc.deposito(ler_numero("Digite o valor de depósito: "));
        cc.saque(ler_numero("Digite o valor de saque: "));
    }
    static double ler_numero(String mensagem) {
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine());
        return numero;
    }
        
}
