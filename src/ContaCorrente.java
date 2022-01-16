public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial + '}';
    }
    public boolean casar(double valor){
        double disponivel = this.chequeEspecial + this.saldo;
        if(valor> disponivel){
            System.out.println("Você não tem saldo disponivel");
            return false;
        }
        else {
            this.saldo-=valor;
            return true;
        }
    }
        public double getSaldo(){
            return this.chequeEspecial + this.saldo;

        }
    }
