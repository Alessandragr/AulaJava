public class MainDois {
    public static void main(String[] args) {
        System.out.println("Entrando na Main!");
        try{

        } catch(NullPointerException ex) { // pega o erro
            System.out.println(ex.getMessage()); // exibe a mensagem que ele gerou
            System.out.println("Deu ruim na chamada do Método Um!"); // exibe uma nova mensagem e não paga o programa. 
        }

        metodoUm();
        System.out.println("Saindo da Main!");
    }
    static void metodoUm() {
        System.out.println("Entrando no Método Um!");
        metodoDois();
        System.out.println("Saindo no Método Um!");
    }
    static void metodoDois() {
        System.out.println("Entrando no Método Dois!");
            String nome = null; //Vai gerar um erro que vai enterromper a execução
            nome.length();
        System.out.println("Saindo da Dois!");
    }
}
