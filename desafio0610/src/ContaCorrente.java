public class ContaCorrente extends Conta {
    private double taxaTransferencia=10.50;
    private double taxaManutencao=2.50;
    private double numeroTransferencias=0.0;

    public void setTaxaTransferencia(double taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }
    public double getTaxaTransferencia() {
        return taxaTransferencia;
    }
    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    public void setNumeroTransferencias(double numeroTransferencias) {
        this.numeroTransferencias = numeroTransferencias;
    }
    public double getNumeroTransferencias() {
        return numeroTransferencias;
    }
    @Override
    public void transferencia(double valor) {
        super.transferencia(valor);
       double saldoTransferencia = getSaldo() - taxaTransferencia;
       setSaldo(saldoTransferencia);
       this.numeroTransferencias ++;

       if(numeroTransferencias%5==0) {
            saldoTransferencia = saldoTransferencia-taxaManutencao;
           setSaldo(saldoTransferencia);
       }
       
    }
}

