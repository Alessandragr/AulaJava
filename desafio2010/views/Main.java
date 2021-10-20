package views;

import controllers.FilmesController;
import controllers.SeriesController;
import models.Filmes;
import models.Series;

public class Main {
   public static void main(String[] args) {
       FilmesController filmesController = new FilmesController();
       SeriesController seriesController = new SeriesController();
    
       Filmes f = new Filmes();
       Filmes f2 = new Filmes();
       Series s = new Series();

       f.nome = "Les Intouchables";
       f.genero = "Drama";
       f.ano = 2011;
       f.id=33;

       f2.nome = "Chocolat";
       f2.genero = "Drama";
       f2.ano = 2016;
       f2.id=36;

       s.nome = "La Casa de Papel";
       s.genero = "Policial";
       s.ano=2017;
       s.id=23;
       s.temporadas = "5";
        
       filmesController.create(f);
       filmesController.exists(f);
       filmesController.create(f2);
       filmesController.delete(f);
       seriesController.create(s);

    }
   
}
