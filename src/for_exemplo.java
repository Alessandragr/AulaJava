package src;

public class for_exemplo {
    public static void main(String[] args) {
//O for do lado de fora gira uma vez para dez vezes o laço de dentro
        for(int linha=1; linha<=10; linha++) {
            System.out.printf("%d - ", linha);

            for (int colunas=1; colunas<=10; colunas++) {
                System.out.printf("%d", colunas);
            }
            System.out.println();
        }
    }
    
}
