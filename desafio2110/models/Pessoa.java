package models;

public class Pessoa extends Base {
    public String nome;
    public String sobrenome;
    public Endereco enderecoResidencial;
    public Endereco enderecoComercial;

    @Override
    public String toString() {
        return "Nome: " + this.nome + " " + this.sobrenome +
            "Endereço Residencial: " + this.enderecoResidencial +
            "Endereço Comercial: " + this.enderecoComercial;
        }
}
