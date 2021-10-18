public class Desktop extends Computador {
    String tamanhoGabinete;
    String monitorExterno;
    String fonte;

    @Override
    public String toString() {
        return super.toString() + "\nTamanho do gabinete: " + this.tamanhoGabinete + "\nMonitor Externo: " + 
        this.monitorExterno + "\nFonte: " + this.fonte + "\n";
    }
}
