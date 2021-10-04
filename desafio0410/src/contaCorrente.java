public class contaCorrente {
    private int agencia;
    private int numero;
    private int codigo;
    private double saldo;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setNumero (int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo () {
        return this.codigo;
    }
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
}
