package views;

import java.util.EmptyStackException;
import java.util.Scanner;

import controllers.ProdutosController;
import models.Produtos;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ProdutosController produtosController = new ProdutosController();
   public static void main(String[] args) {
       
   } 
   public void menu(){
       System.out.println("------ Bem-vindo(a) ao Cadastro de Produtos ------");
       System.out.println("Escolha a sua opção: ");
       System.out.println("1 - para cadastrar");
       System.out.println("2 - para Listar");
       System.out.println("3 - para remover");
       System.out.println("4 - para update");
       System.out.println("5 - para sair");
   }
   static int numberReader(String mensagem) {
       int numero=0;
       boolean valido;
    System.out.println(mensagem);
    do {
        try {
            numero = Integer.parseInt(scan.nextLine());
            valido = true;
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido! O valor tem que ser numérico!");
            System.out.println("Digite novamente: ");
            valido = false;
        }
    } while(!valido);
    return numero;
    }
    static String textReader(String mensagem) {
        System.out.println(mensagem);
        boolean valido = true;
        String texto="";
        do {
            try {
                 texto = scan.nextLine();
                if(texto.length()<3) {
                    valido = true;
                }
            } catch(Exception e) {
                System.out.println("Quantidade de caracteres inválida! Favor inserir mais de 3 caracteres!");
                System.out.println("Digite novamente: ");
                valido = false;
            }
        } while(!valido);
        return texto;
    }
    static public void choose() {
        int opcao;
        do {
            switch (opcao) {
                case 1:
                Produtos p = new Produtos();
                p.id = numberReader("Digite o ID do produto: ");
                p.nome = textReader("Digite o nome do produto: ");
                p.descricao = textReader("Digite a descrição do produto: ");
                p.valor = numberReader("Digite o valor do produto: ");
                produtosController.create(p);
                    break;
                case 2: 
                for (Produtos p : produtosController.read()) {
                    System.out.printf("ID: %d\nNome: %s\nDescrição: %s\nValor: R$ %d", p.id, p.descricao, p.valor);
                }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                System.out.println("Programa finalizado!");
                    break;
            }
            }
        }
    }
}
