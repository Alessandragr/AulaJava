public class Calculo {
    private double calculo, calculo2, calculo3;
    

    public double calculoIss(double valor){
        calculo = valor* 0.05;
        return calculo;
    }
    public double calculoIof(double valor, char operacao) {
        double iof;
        if(operacao=='C') {
            iof=0.0648;
            calculo2 = valor* iof;
            
        } else if (operacao=='S') {
            iof=0.25;
            calculo2 = valor* iof;
            
        } else if (operacao =='M'){
            iof = 0.011;
            calculo2 = valor* iof;
        
        }
        return calculo2;
    }
    public double calculoIr(double valor) {
        double ir;
        if (valor>1903.99) {
            System.out.println("Você não paga IR");
        }
         else if (valor>=1903.99 && valor<2826.66) {
            ir = 0.075;
            calculo3 = valor*ir;
        } else if (valor>=2826.66 && valor<3751.06){
            ir = 0.15;
            calculo3 = valor*ir;
        } else if (valor>=3751.06 && valor<4664.68) {
            ir = 0.22;
            calculo3 = valor*ir;
        }
        else if (valor>=4664.68) {
            ir = 0.275;
            calculo3 = valor*ir;
        }
        return calculo3;
    }
}

