public class contaCorrente {
    private byte agencia;
    private byte numero;
    private byte codigo;
    private double saldo;

    public void setAgencia(byte agencia) {
        this.agencia = agencia;
    }
    public byte getAgencia(){
        return this.agencia;
    }
    public void setNumero (byte numero) {
        this.numero = numero;
    }
    public byte getNumero() {
        return this.numero;
    }
    public byte setCodigo() {
        return this.codigo;
    }
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
}
