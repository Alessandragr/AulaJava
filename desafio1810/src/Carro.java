public class Carro {
    int numeroPortas;
    int capacidadePortaMalas;

    @Override
    public String toString() {
        return this.capacidadePortaMalas + " " + this.numeroPortas;
    }
}
