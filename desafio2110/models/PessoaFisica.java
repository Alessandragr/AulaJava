package models;

public class PessoaFisica extends Pessoa {
    public String cpf;

    @Override
    public String toString() {
        return super.toString() + " CNPJ: " + this.cpf;
    }
}
