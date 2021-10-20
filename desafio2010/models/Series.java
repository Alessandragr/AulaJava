package models;

public class Series extends Filmes{
    public String temporadas;
    public int id;

    @Override
    public String toString() {
        String retorno = super.toString() + "\n" + "Temporadas: " + this.temporadas;
        return retorno;
    }
}
