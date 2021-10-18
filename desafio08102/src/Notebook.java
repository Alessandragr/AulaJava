public class Notebook extends Computador{
    String bateria;
    String velocidadeWifi;
    String versaoBluetooth;

    @Override
    public String toString() {
        return super.toString() + "\nBateria: " + this.bateria + "\nVelocidade Wifi: " +
        this.velocidadeWifi + "\nVersão Bluetooth: " + this.versaoBluetooth + "\n";
    }
}
