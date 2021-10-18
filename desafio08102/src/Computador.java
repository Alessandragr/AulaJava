public class Computador {
    String marca;
    String memoriaRam;
    String processador;
    String discoRigido;

    @Override
    public String toString() {
        return "Marca: " + this.marca + "\nMemória Ram: " + 
        this.memoriaRam + "\nProcessador: " + this.processador + 
        "\nDisco rígito: " + this.discoRigido;
    }
}
