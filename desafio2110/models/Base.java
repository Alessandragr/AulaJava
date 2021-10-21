package models;

public class Base {
    public int id;
    

    @Override
    public boolean equals(Object obj) {
       Base outra = (Base)obj;
        if(this.id==outra.id) {
            return true;

        }
        return false;
    }
}
