package models;

public class Filmes {
    public String nome;
    public String genero;
    public int ano;
    public int id;
    
    @Override
    public boolean equals(Object t) {
        if(t instanceof Filmes) {
            Filmes outroFilme = (Filmes)t;
            if(this.id==outroFilme.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String retorno = "Nome: " + this.nome + "\n" + "Gênero: " + this.genero + "\n" + 
            "Ano: " + this.ano;
            return retorno;
    }
}
