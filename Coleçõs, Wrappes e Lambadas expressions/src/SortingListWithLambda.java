import java.util.LinkedList;

public class SortingListWithLambda {

    public static void main(String[] args) {

        LinkedList<ContaCorrente> lista = new LinkedList<>();
        ContaCorrente conta1 = new ContaCorrente(103333, 5000F, "Filipe");
        ContaCorrente conta2 = new ContaCorrente(104444, 2500F, "Carlos");
        ContaCorrente conta3 = new ContaCorrente(104444, 1500F, "João");
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);

        lista.forEach((conta) -> System.out.println(conta.toString()));

        System.out.println("--------------------");
        System.out.println("Lista ordenada por saldo");
        lista.sort((c1, c2) -> Float.compare(c1.getSaldo(), c2.getSaldo()));
        lista.forEach((conta) -> System.out.println(conta.toString()));

        System.out.println("--------------------");
        System.out.println("Lista ordenada por nome");
        lista.sort((c1, c2) -> c1.getNomeTitular().compareTo(c2.getNomeTitular()));
        lista.forEach((conta) -> System.out.println(conta.toString()));

    }
}

