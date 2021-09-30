
public class Calculo {
    
    private double result1;
    private double result2;
    static char continua;
    private int qtdSaques;
    private double taxa = 1.30;
 
public double transferencia (double valor) {
    result1 = valor * 0.00001;
    return result1;
}
    public double saque(double valor) {
        qtdSaques++;

        if(qtdSaques%5==0) {
            result2 = taxa;
        } else {
            result2 = 0;
        } 
        return result2;
    }
public double resultadoFinal (int operacao) {
    switch (operacao) {
        case 1: 
        return result1;
        case 2:
        return result2;
        default:
        return -1;
    }
}
public void imprimirResultado(){
    System.out.printf("Transferência: %.4f \nSaque: %.4f", result1, result2);
}
}

