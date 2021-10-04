import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int[] num = new int[10];
        for (int i=0; i< num.length; i++) {
            System.out.println("\nInforme um número:\n");
            num[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i=0; i< num.length; i++) {
            System.out.printf("\nVocê informou o número %d!", num[i]);
        }
        scan.close();
    }
    
}
