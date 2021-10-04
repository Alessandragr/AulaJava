import java.util.Random;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        
        PessoaFisica[] pessoas = new PessoaFisica[5];
        /*
        PessoaFisica Ana = new PessoaFisica();
        Ana.setNome("Ana");
        Ana.setIdade(25);
        pessoas[0] = Ana;
        PessoaFisica Beto = new PessoaFisica();
        Beto.setNome("Beto");
        Beto.setIdade(26);
        pessoas[1] = Beto;
        
        
        for (int i=0; i <= pessoas.length-1; i++) {
            PessoaFisica pf = new PessoaFisica();
            pf = pessoas[i];
            System.out.println("nome " + pf.getNome() );
            System.out.println("idade " + pf.getIdade());
        }
        */
        PessoaFisica pf = new PessoaFisica();

        for (int i=0; i < pessoas.length; i++) {

        System.out.println("Informe seu nome: ");
        pf.setNome(scan.nextLine());
        System.out.println("Informe seu sobrenome: ");
        pf.setSobrenome(scan.nextLine());
        System.out.println("Informe sua idade: ");
        pf.setIdade(Byte.parseByte(scan.nextLine()));
        System.out.println("Informe seu RG: ");
        pf.setRg(Integer.parseInt(scan.nextLine()));
        System.out.println("Informe seu CPF: ");
        pf.setCpf(Integer.parseInt(scan.nextLine()));
        pf.setCodigo(random.nextInt(100));
        pessoas[i] = pf;
        System.out.printf("Olá, %s %s!\n Seus dados são: \nIdade: %d\nRG: %d\nCPF: %d\nCódigo: %d\n", pessoas[i].getNome(), pessoas[i].getSobrenome(), pessoas[i].getIdade(), pessoas[i].getRg(), pessoas[i].getCpf(), pessoas[i].getCodigo());
    }
    
    scan.close();
    }
    
}
