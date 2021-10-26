package models;

public class Produtos extends Base{
    public String nome;
    public String descricao;
    public double valor;
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Produtos) {
            Produtos outro = (Produtos)obj;
            if(this.id==outro.id) {
            return true;
            }
            
        }
        return false;
    }
    @Override
    public String toString() {
        String retorno = "Nome: " + this.nome + "\n" + "Descrição: " + this.descricao + "\n" +
        "Valor: R$ " + this.valor;
        return retorno;
    }
}
