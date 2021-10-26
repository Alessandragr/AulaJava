import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Calculo calculo = new Calculo();
    public static void main(String[] args) {
        menu();
        escolha();
    }
    static public void menu() {
        System.out.println("------Bem-vindo(a) a Calculadora Java");
        System.out.println("Escolha a sua opção:\n1- para somar;\n2- para subtrair;\n3- para multiplicar;\n4- para dividir");
    }
    static int ler_numero(String mensagem) {
        System.out.println(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        return numero;
    }
    static public void escolha() {
        int resultado=0;
        int opcao=0;

        do {
            try{
                opcao = ler_numero("Informe sua opção: ");
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                System.out.println("Somente números inteiros são aceitos!");
                opcao=-1;
            }
            if (opcao<0 || opcao >4) {
                System.out.println("Opção inválida!");
            }
        } while(opcao<0 || opcao>5);
            
            int a = ler_numero("Informe o primeiro número: ");
            int b = ler_numero("Informe o segundo número: ");
            
        switch (opcao) {
            case 1:
                resultado = calculo.soma(a, b);
                break;
            case 2:
                resultado = calculo.subtracao(a, b);
                break;
            case 3:
                resultado = calculo.multiplicacao(a, b);
                break;
            case 4:
            resultado = calculo.divisao(a, b);
            break;
            default:
            System.out.println("Encerrando o programa!");
            break;
        } System.out.printf("O Resultado final é: %d", resultado);       
    }

}
