public class Dados {

    private Object[] dados; // criou privada porque não tem acesso aos dados e sim ao método.
    private int posicao; // não inicializou porque ela sempre começa com zero. Controla quantos itens foram adicionados.


    public Dados() { //Define a quantidade de posições. O outro array tem métodos.
        this.dados = new Object[5];
    }
    public int numeroItens() {
        return posicao;
    }
    public void add(Object obj) {
        verificaTamanhoArray(); // pode chamar um método de outro método. Desde que esse método chamado não tenha outros métodos que chamam outros métodos.
        this.dados[posicao] = obj;
        posicao++;  
    }
    private void verificaTamanhoArray() {
        if(posicao >= this.dados.length) {
            // a posição é sempre inicializada em zero. Recebe o objeto. e incrementa.
            // int novoTamanho = this.dados.length +5;
            // Object[] dados2 = new Object[novoTamanho];
            Object[] dados2 = new Object[this.dados.length +5]; 
            for (int i = 0; i < dados.length; i++) { // percorre os itens do array 
                dados2[i]= dados[i]; // transfere os dados presentes no array de dados para dados2.
            }
            dados=dados2; 
        }
    }
    public void remove(Object obj) {
        verificaMetodo(obj, "remove");
        // for (int i = 0; i < dados.length; i++) {
        //     if(obj.equals(dados[i])) {
        //         reorganizaArray(i);
        //     }
        // }
    }
    private boolean igual(Object obj) {

        // for (int i = 0; i < dados.length; i++) {
        //     if (obj.equals(dados[i])) {
        //         return true;
        //     }
        // } 
        return verificaMetodo(obj, "igual");
    }
    private void reorganizaArray(int pos) {
        for (int i = pos; i < posicao; i++) { // ele percorre o array até a quantidade de posições não adicionadas. Uma vez que o array pode ser maior do que a quantidade de posições adicionadas.
            dados[i] = dados[i+1];
        }
        posicao--; // decrementa a posição para que quando adicionar um novo ele adiciona nessa posição.
    }
    public boolean existe(Object obj) {
        return igual(obj);
    }
    private boolean verificaMetodo(Object obj, String metodo) {
        for (int i = 0; i < dados.length; i++) {
            if(obj.equals(dados[i])) {
               if(metodo.equals("remove")) {
                   reorganizaArray(i);
                   
               } else {
                   return true;
               }
            }
        } return false;
    }
}
