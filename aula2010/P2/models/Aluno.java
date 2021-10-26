public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno) { // verifica se é uma instância de pessoa. Se for retorna true.
            Aluno outro = (Aluno)obj;
            if(this.matricula.equals(outro.matricula) && this.curso.equals(outro) &&
            this.curso.equals(outro.curso) && super.equals(outro)) { // o super equals compara com a mãe para evitar que classes diferentes sejam comparadas e consideradas iguais.
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String retorno = super.toString() + this.matricula + " " + this.turma + " " + this.curso;
        return retorno;
    }
}
