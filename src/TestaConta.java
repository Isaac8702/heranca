public class TestaConta {

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(2, 1, "AA", 100.0, 1000.0);
        System.out.print(cc1);

        System.out.print("O saldo da conta corrente é:" + cc1.getSaldo());

        ContaPoupanca P1 = new ContaPoupanca(33,3,"Banco CCC",10.00,20,0.05);
        System.out.print("O saldo da conta poupança é:" + P1.getSaldo());
    }
}