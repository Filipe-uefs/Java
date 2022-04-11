import java.util.LinkedList;
import java.util.Comparator;

public class SortingList {

    public static void main(String[] args) {

        LinkedList<ContaCorrente> lista = new LinkedList<>();
        ContaCorrente conta1 = new ContaCorrente(103333, 5000F, "Filipe");
        ContaCorrente conta2 = new ContaCorrente(104444, 2500F, "Carlos");
        ContaCorrente conta3 = new ContaCorrente(104444, 1500F, "João");
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);

        for(ContaCorrente conta: lista) {
            System.out.println(conta.toString());
        }

        System.out.println("--------------------");
        System.out.println("Lista ordenada por saldo");
        SaldoComparator comparator = new SaldoComparator();
        lista.sort(comparator);
        for(ContaCorrente conta: lista) {
            System.out.println(conta.toString());
        }

        System.out.println("--------------------");
        System.out.println("Lista ordenada por nome");
        NomeComparator comparatorNome = new NomeComparator();
        lista.sort(comparatorNome);
        for(ContaCorrente conta: lista) {
            System.out.println(conta.toString());
        }

    }
}

class NomeComparator implements Comparator<ContaCorrente> {

    @Override
    public int compare(ContaCorrente conta1, ContaCorrente conta2) {
        return conta1.getNomeTitular().compareTo(conta2.getNomeTitular());
    }
}

class SaldoComparator implements Comparator<ContaCorrente> {

    @Override
    public int compare(ContaCorrente conta1, ContaCorrente conta2) {
        return Float.compare(conta1.getSaldo(), conta2.getSaldo());
    }
}
