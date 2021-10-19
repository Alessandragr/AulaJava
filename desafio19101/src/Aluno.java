public class Aluno extends Pessoa {
    String matricula;
    String turma;
    String curso;
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Aluno) {
            Aluno a2 = (Aluno)obj;
            if(this.matricula.equals(a2.matricula) && this.turma.equals(a2.turma) && this.curso.equals(a2.curso)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + this.matricula + 
        "\nTurma: " + this.turma + "\nCurso: " + this.curso;
    }
}
