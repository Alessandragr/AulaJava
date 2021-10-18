public class Veiculo {
    String marca;
    String modelo;
    String placa;
    
    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " " + this.placa;
    }
}

