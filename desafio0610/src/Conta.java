
public class Conta {
    
    private int codigoCliente;
    private double saldo;

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public int getCodigoCliente() {
        return codigoCliente;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void transferencia (double valor) {
        this.saldo -= valor;
        
    }

}