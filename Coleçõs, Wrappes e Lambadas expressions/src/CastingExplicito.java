public class CastingExplicito {

    public static void main(String[] args) {

        Object[] objs = new Object[4];
        objs[0] = new ContaCorrente(339949, 3000F);

        ContaCorrente conta1 = (ContaCorrente) objs[0];
        System.out.println("Saldo é " + conta1.getSaldo());
    }
}
