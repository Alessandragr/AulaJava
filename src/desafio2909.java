package src;

public class desafio2909 {
    public static void main(String[] args) {
        Pessoa person = new Pessoa();
        Pessoa person2 = new Pessoa();
        for (int i=1; i<2; i++)
        {
            person.nome="Alessandra";
            person.sobrenome="Ribeiro";
            person.idade=28;
            person2.nome="Daiane";
            person2.sobrenome="Ribeiro";
            person2.idade=34;
            System.out.printf("Olá, seu nome completo é: %s %s e você tem %d anos.\n", person.nome, person.sobrenome, person.idade);
            System.out.printf("Olá, seu nome completo é: %s %s e você tem %d anos.\n", person2.nome, person2.sobrenome, person2.idade);
        }
    }
    
}
