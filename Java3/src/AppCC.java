public class AppCC {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente("Lucas Floriano")

                cc1.depositar(1000);
                cc1.sacar(205.78);
                cc1.depositar(1560.20);

                System.out.println("titular: " + cc1.getTitular());
                System.out.println("saldo: " + cc1.verificarSaldo);
    }
}
