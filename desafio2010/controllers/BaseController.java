package controllers;

import java.util.ArrayList;

public class BaseController <T> {

    private ArrayList <T> info;

    public BaseController() {
        this.info= new ArrayList<T>();
    }
    public int numberItems() {
        return info.size();
    }
    public ArrayList<T> read(){
        return this.info;
    }
    public boolean exists(T t) {
        return this.info.contains(t);
    }
    public void create(T t) {
        this.info.add(t);
    }
    public void delete(T t){
        this.info.remove(t);
    }
    public void update(T t) {
        if(exists(t)) {
            this.delete(t);
            this.create(t);
        }
    }
    
    
}
