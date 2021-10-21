package views;

import controllers.PessoaFisicaController;
import controllers.PessoaJuridicaController;
import models.Endereco;
import models.PessoaFisica;
import models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pessoaFisicaController = new PessoaFisicaController();
        PessoaJuridicaController pessoaJuridicaController = new PessoaJuridicaController();

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        

        Endereco end = new Endereco();

        pj.cnpj="5238894";
        end.cep="015200";
        end.cidade="São Paulo";
        end.complemento="Loja 4";
        end.logradouro="Rua 4";
        end.numero="740";
        end.id=4567;
        pj.enderecoComercial = end;
        
        pessoaJuridicaController.create(pj);
        System.out.println(pessoaJuridicaController.existe(pj));
        pessoaJuridicaController.delete(pj);

    }
}