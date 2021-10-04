public class TelaPrincipal {
    public static void main(String[] args) {
        Produto p = new Produto();

        p.setNome("Celular");
        String n = p.getNome();
        p.setCodigo(1234);
        int c =p.getCodigo();
        p.setDescricao("Celular Novo");
        String d = p.getDescricao();
        p.setValor(999.00);
        double v = p.getValor();

        System.out.printf("O %s tem código %d e é %s. Seu valor é %.2f", n, c, d, v);


    }
    
}
