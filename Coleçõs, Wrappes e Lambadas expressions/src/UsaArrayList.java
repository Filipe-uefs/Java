import java.util.ArrayList;

public class UsaArrayList {

    public static void main(String[] args) {

        ArrayList<ContaCorrente> lista = new ArrayList<>();
        ContaCorrente conta1 = new ContaCorrente(103333, 1000F, "Filipe");
        ContaCorrente conta2 = new ContaCorrente(104444, 5500F, "Filipe");
        ContaCorrente conta3 = new ContaCorrente(104444, 5500F, "Filipe");
        lista.add(conta1);
        lista.add(conta2);

        System.out.println("Conta 3 ja existe na lista ? " + lista.contains(conta3));
        int tamanho = lista.size();
        System.out.println("Tamanho da lista " + tamanho);
        lista.remove(0);
        tamanho = lista.size();
        System.out.println("Novo tamanho da lista " + tamanho);

        for(ContaCorrente conta: lista) {
            System.out.println("Numero da conta: " + conta.getNumero() + " Saldo: " + conta.getSaldo());
        }
    }
}
