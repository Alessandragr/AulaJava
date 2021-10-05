import java.util.Scanner;

public class Universidade {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Coordenador c = new Coordenador();
        Aluno a = new Aluno();
        menu();
        int opcao = Integer.parseInt(scan.nextLine());
        if(opcao==1) {
            System.out.println("Informe o nome: ");
            c.setNome(scan.nextLine());
            System.out.println("Informe o sobrenome: ");
            c.setSobrenome(scan.nextLine());
            System.out.println("Informe a matrícula: ");
            c.setMatricula(Integer.parseInt(scan.nextLine()));
            System.out.println("Informe o departamento: ");
            c.setDepartamento(scan.nextLine());
            System.out.println("Informe o curso coordenado: ");
            c.setCursoCoordenado(scan.nextLine());
            System.out.println("Informe o salário: ");
            c.setSalario(Double.parseDouble(scan.nextLine()));
            System.out.println("Informe o bonus: ");
            c.setBonus(Double.parseDouble(scan.nextLine()));

            Double aumento = (c.getBonus()/100)*c.getSalario();

            System.out.printf("Olá, %s %s. Você está registrado na matrícula: %d e é coordenador do %s e do curso %s. Seu salário e bonus são %.2f %.2f, respectivamente.", c.getNome(), c.getSobrenome(), c.getMatricula(), c.getDepartamento(), c.getCursoCoordenado(), c.getSalario(), aumento);

        } 
        else if (opcao == 2) {

            System.out.println("Informe o nome: ");
            f.setNome(scan.nextLine());
            System.out.println("Informe o sobrenome: ");
            f.setSobrenome(scan.nextLine());
            System.out.println("Informe a matrícula: ");
            f.setMatricula(Integer.parseInt(scan.nextLine()));
            System.out.println("Informe o departamento: ");
            f.setDepartamento(scan.nextLine());
            System.out.println("Informe o salário: ");
            f.setSalario(Double.parseDouble(scan.nextLine()));

            System.out.printf("Olá %s %s. Você trabalha no %s sob matrícula %d. Seu salário é R$ %.2f", f.getNome(), f.getSobrenome(), f.getDepartamento(), f.getMatricula(), f.getSalario());
        }
        else if(opcao==3) {
            System.out.println("Informe o nome: ");
            a.setNome(scan.nextLine());
            System.out.println("Informe o sobrenome: ");
            a.setSobrenome(scan.nextLine());
            System.out.println("Informe a matrícula: ");
            a.setMatricula(Integer.parseInt(scan.nextLine()));
            System.out.println("Informe o curso: ");
            a.setCurso(scan.nextLine());
            System.out.println("Informe a turma: ");
            a.setTurma(scan.nextLine());

            System.out.printf("Olá %s %s. Você está matriculado no curso: %s, na turma %s. Sua matrícula é: %d", a.getNome(), a.getSobrenome(), a.getCurso(), a.getTurma(), a.getMatricula());

        } else {
            System.out.println("Opção inválida!");
        }
       
    }
    static void menu(){
        System.out.println("#### Cadastro ####\n");
        System.out.println("1 - para Coordenador\n2 - para funcionario \n3 - para aluno\nInsira sua opção:");
    }
    
}
