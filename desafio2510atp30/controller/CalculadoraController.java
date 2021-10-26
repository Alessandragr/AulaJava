public class CalculadoraController {
    
    public int soma(int a, int b) {
        int soma = a + b;
        return soma;
    }
    public int subtracao( int a, int b) {
        int subtracao;
        if(a>b) {
        subtracao = a - b;
        } else {
        subtracao = b - a;
        }
        return subtracao;
    }
    public int multiplicacao (int a, int b) {
        int multiplicacao = a * b;
        return multiplicacao;
    }
    public int divisao(int a, int b) {
        int divisao=0;
        if (b==0) {
        try {
            divisao= a / b;  
        } catch(ArithmeticException exception) {
        System.out.println(exception.getMessage());
        System.out.println("Erro! O dividendo é zero!");
        } 
        }
        return divisao;
    }
}