public class Pessoa {
    String nome;
    String sobrenome;
    int idade; // equals não compara int e double. Logo a comparação é feita por ==;

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Pessoa) {
            Pessoa p2 = (Pessoa)obj;
            if(this.nome.equals(p2.nome) && this.sobrenome.equals(p2.sobrenome) && this.idade==p2.idade) {
                return true;
            } 
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n Nome Completo: " + this.nome + " " + this.sobrenome +
        "\nIdade: " + this.idade;
    }
}