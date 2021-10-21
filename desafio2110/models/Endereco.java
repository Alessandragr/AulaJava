package models;

public class Endereco extends Base{
    public String logradouro;
    public String complemento;
    public String numero;
    public String cep;
    public String cidade;

    @Override
    public String toString() {
        return "O Endereço é: " + "\n" + this.logradouro +
        " " + this.complemento + " " + this.numero + " " +
        this.cep + " " + this.cidade;
        }
}
