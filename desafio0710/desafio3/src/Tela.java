package src;
public class Tela {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        
       int resultado = c.soma(10,20);
       double resultado2 = c.soma(20,30);
       float resultado3 = c.soma(30f,40f,50f);
       long resultado4 = c.soma(40,50,60);

       System.out.println(resultado);
       System.out.println(resultado2);
       System.out.println(resultado3);
       System.out.println(resultado4);
    }
    
}
