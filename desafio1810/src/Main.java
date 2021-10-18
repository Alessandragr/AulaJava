public class Main {
    public static void main(String[] args) {
        Veiculo vUm = new Veiculo();
        Carro cUm = new Carro();

        vUm.marca = "Volvo";
        vUm.marca = "Suv";
        vUm.placa = "ABC0404";

        cUm.capacidadePortaMalas = 600;
        cUm.numeroPortas = 5;

        Object obj = cUm;
        Object obj1 = vUm;

        Carro cDois = (Carro)obj;
        Veiculo vDois = (Veiculo)obj1;
        

        System.out.println(vDois);
        System.out.println(cDois);
    }
}
