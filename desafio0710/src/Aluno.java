public class Aluno {

    private String nomeCompleto;
    private byte idade;
    private int matricula;
    
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    public byte getIdade() {
        return idade;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
    @Override
    public String toString() {
        String objeto = this.nomeCompleto + " " + 
        this.idade + " " + this.matricula;
        return objeto;
    }

}
