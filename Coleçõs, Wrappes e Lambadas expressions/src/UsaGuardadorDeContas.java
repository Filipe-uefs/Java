public class UsaGuardadorDeContas {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente conta1 = new ContaCorrente(103333, 1000F);
        ContaCorrente conta2 = new ContaCorrente(104444, 5500F);
        guardador.adicionar(conta1);
        guardador.adicionar(conta2);

        int tamanho = guardador.getQuantidadeDeElementos();
        ContaCorrente conta = guardador.getReferencia(0);
        System.out.println("Saldo do elemento da posição 1 é " + conta.getSaldo());
        System.out.println("Tem " + tamanho + " elementos no array");
    }
}
