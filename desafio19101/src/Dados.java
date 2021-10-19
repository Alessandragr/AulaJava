
public class Dados {
    private Object[] objeto;
    int posicaoAtual = 0;
    int tamanhoAtual=5;
    
    public Dados(){
        this.objeto = new Object[tamanhoAtual];
        }

    public String adicionar(Object obj){
        String mensagem;
        if(posicaoAtual < objeto.length){
            objeto[posicaoAtual] = obj;
            posicaoAtual ++;
        }else{
            tamanhoAtual = tamanhoAtual + 5;
            Object[] objeto2 = new Object[tamanhoAtual];

            for (int i = 0; i < objeto.length; i++) {
                objeto2[i] = objeto[i];
            }
            objeto = objeto2;
        }
    mensagem = "Salvo com sucesso";
    return mensagem;
    }
    public int quantidade () {
        return objeto.length;
    }
    public String remover(Object obj){
        for (int i = 0; i < objeto.length; i++) {
            if( objeto[i].equals(obj)){
                reorganiza(i);
                posicaoAtual --;
                return "removido com sucesso";
            }
        }
        return "Não encontrado";
    }
    public void reorganiza(int posicao){
        for (int i = posicao; i < objeto.length -1; i++) {
            this.objeto[i] = this.objeto[i+1];
        }
    }
    public boolean contem(Object obj){
    
        for (int i = 0; i < posicaoAtual; i++) {
            if(objeto[i].equals(obj)){
                return true;
            }
        }
        return false;
    }
}
