import java.util.Scanner;

public class Tela {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

       Aluno a = new Aluno();
       Aluno b = new Aluno();

        a.setNomeCompleto(ler_texto("Digite o seu nome e sobrenome: "));
        a.setIdade(ler_numero("Digite a sua idade: "))

        System.out.println("Nome completo e idade: ", a.toString);

        b.setNomeCompleto(ler_texto("Digite o seu nome e sobrenome: "));
        b.setIdade(ler_numero("Digite a sua idade: "))

        System.out.println("Nome completo e idade: ", b.toString);
        
                
    }
    static String ler_texto(String mensagem) {
        System.out.print(mensagem);
        String texto = scan.nextLine();
        return texto;
    }
    static int ler_numero(String mensagem) {
        System.out.print(mensagem);
        int numero = scan.nextLine();
        return numero;
    }
}
