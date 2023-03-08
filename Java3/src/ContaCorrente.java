public class ContaCorrente {

    private double saldo;
    private String titular;

    public ContaCorrente(String titular){
        this.titular = titular;
    }

    public void depositar(double ValorDeposito) {
        this.saldo += ValorDeposito;
        System.out.println("seu novo saldo é R$ " + this.saldo);
    }

    public void sacar(double ValorSaque) {
        if (ValorSaque <= this.saldo) {
            this.saldo -= ValorSaque;
            System.out.println("seu saldo, após o saque é de: ");
        } else {
            System.out.println("Seu saldo é inválido!");
        }
    }

    public double verificarSaldo(){
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
