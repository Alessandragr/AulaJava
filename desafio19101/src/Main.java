public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa pDois = new Pessoa();
        Aluno a = new Aluno();
        Dados d = new Dados();

        p.idade=18;
        p.nome = "Ana";
        p.sobrenome = "Silva";

        pDois.idade=18;
        pDois.nome = "Ana";
        pDois.sobrenome = "Silva";
        
        a.nome = "Carla";
        a.sobrenome = "Souza";
        a.idade = 19;
        a.curso = "Medicina";
        a.matricula = "112233";
        a.turma = "B";
        
        //d.adicionar(a);
        System.out.println(d.adicionar(a));
        System.out.println(d.adicionar(p));
        System.out.println(d.adicionar(pDois));
       // System.out.println(d.contem(pDois));
        System.out.println(d.tamanhoAtual);
        System.out.println(d.remover(a));
    }
}
