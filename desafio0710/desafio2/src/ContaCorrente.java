public class ContaCorrente {
    private double saldo;
    private double taxaSaque=10.0;
    private int codigoCliente;
    
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public  ContaCorrente(double saldo, int codigoCliente) {
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }
    public double saque(double valor) {
        double valorFinal = saldo - valor - taxaSaque;
        return valorFinal;
    }
    public double deposito(double valorDeposito) {
        double valorAposDeposito += valorFinal;
        return valorAposDeposito;
    }
    @Override
    public String toString() {
        
        return "Código do cliente: " + " " + this.codigoCliente + 
                "\nValor do depósito :" + " " + this.deposito + 
                "\nValor do saque: " + this.saque;
    }
}
