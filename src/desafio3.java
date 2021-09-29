package src;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = Integer.parseInt(scan.nextLine());
        int fatorial =1;
        for(int i=numero; i>0; i--)
        {
            fatorial =fatorial*i;
        }
        System.out.printf("=%d", fatorial);
        scan.close();
    }
    
}
