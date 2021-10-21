package controllers;

import java.util.ArrayList;

public class BaseController <T> { // Generics
    private ArrayList <T> dados; 
    
    public BaseController() { 
        this.dados = new ArrayList<T>();
    }
    public int numeroItens() {
        return dados.size();
    }
    public void create(T t) {
       this.dados.add(t); 
    }
    public void delete(T t) {
        this.dados.remove(t); 
    }
    public boolean existe(T t) {
        return this.dados.contains(t); 
    }
    public void update(T t) {
        if(existe(t)) {
            this.delete(t);
            this.create(t);
        }
    }
    
}
