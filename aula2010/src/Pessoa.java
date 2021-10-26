public class Pessoa {
    public String nome;
    public String sobrenome;
    public byte idade;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa) {
            Pessoa outra = (Pessoa)obj; // é feito para comparar um objeto com uma pessoa e se ambos forem iguais é feito essa etapa. É preferível fazer dentro de cada classe para evitar erros.
            if(this.nome.equals(outra.nome) && // equal é uma validação booleana
            this.sobrenome.equals(outra.sobrenome) &&
            this.idade==outra.idade) {
                return true;
            }

        }
        return false;
    }
    @Override
    public String toString() {

    String retorno = this.nome + " " + this.sobrenome + " " + this.idade;
    return retorno;
    }
}