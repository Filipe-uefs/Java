public class ArrayReferencia {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[4];
        ContaCorrente conta1 = new ContaCorrente(484848, 1000F);
        ContaCorrente conta2 = new ContaCorrente();
        conta2.setNumero(1991919);
        conta2.setSaldo(2000F);
        contas[0] = conta1;
        contas[1] = conta2;
        System.out.println("Saldo da primeira conta " + contas[0].getSaldo());
        System.out.println("Número da segunda conta " + contas[1].getNumero());

    }
}
