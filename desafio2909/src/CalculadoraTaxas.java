import java.util.Scanner;

public class CalculadoraTaxas {

    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        Calculo cal = new Calculo();
        char continua ='N';
        
        do {
            cal.resultadoFinal(ler_numero("Digite: 1 - para saques;\n 2 - para transferências: \n"));
            cal.transferencia(ler_double("Digite o valor: "));
            cal.imprimirResultado();
            continua = ler_texto("\nDigite S para informar nova operação: ");
        } while(continua=='S');
    }
    static int ler_numero(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        return numero;
    }
    static char ler_texto(String mensagem) {
        System.out.print(mensagem);
        char texto = scan.nextLine().toUpperCase().charAt(0);
        return texto;
    }
    static double ler_double(String mensagem) {
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine());
        return numero;
    }
    
    
}
