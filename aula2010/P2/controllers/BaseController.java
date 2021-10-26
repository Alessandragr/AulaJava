//Generics <T:Object> o T ele herda de uma classe específica.
public class BaseController <T> { //T por causa de type.
   
    private ArrayList <Object> dados; 
    
    public BaseController() { 
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
