package models;

public class PessoaJuridica extends Pessoa {
    public String cnpj;
    
    @Override
    public String toString() {
        return super.toString() + " CNPJ: " + this.cnpj;
    }
}
