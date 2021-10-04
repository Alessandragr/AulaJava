public class PessoaFisica {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private int rg;
    private int cpf;
    private int codigo;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public int getRg() {
        return this.rg;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCpf() {
        return this.cpf;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }
}
