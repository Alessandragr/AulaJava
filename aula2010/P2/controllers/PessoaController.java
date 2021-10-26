import java.util.ArrayList;

public class Dados {

    private ArrayList <Object> dados; 
    


    public PessoaController() { 
        this.dados = new ArrayList<Object>();
    }
    public int numeroItens() {
        return dados.size();
    }
    public void create(Pessoa p) {
       this.dados.add(obj); 
    }
    public void delete(Pessoa p) {
        this.dados.remove(obj); 
    }
    public boolean existe(Pessoa p) {
        return this.dados.contains(obj); 
    }
    public ArrayList read() {
        return this.dados;
    }
    public void update(Pessoa p) {
        if(existe(p)) {
            this.delete(p);
            this.create(p);
        }

    }
}