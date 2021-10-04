public class TelaPrincipalBanco {
    public static void main(String[] args) {

        contaCorrente c = new contaCorrente();

        c.setAgencia(123);
        int a = c.getAgencia();
        c.setNumero(123);
        int n = c.getNumero();
        c.setCodigo(123);
        int cd = c.getCodigo();
        c.setSaldo(1000.00);
        double s = c.getSaldo();

        System.out.printf("Você possui conta na agência %d, sendo a conta: %d de código %d. Seu saldo é %.2f.", a, n, cd, s);

    }
    
}
