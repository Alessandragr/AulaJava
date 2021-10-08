import java.util.Scanner;

public class Tela {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

       Aluno a = new Aluno();
       Aluno b = new Aluno();

        ler_texto("Digite o seu nome e sobrenome: ");
        System.out.printf("Seu nome completo é %s", objeto);
                
    }
    static String ler_texto(String mensagem) {
        System.out.print(mensagem);
        String texto = scan.nextLine();
        return texto;
    }
}
