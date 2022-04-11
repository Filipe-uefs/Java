package JUnit;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {

    public void reajustar(Funcionario funcionario, Desempenho desempenho) {

        BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajustar());
        funcionario.setSalario(funcionario.getSalario().add(reajuste).setScale(2, RoundingMode.HALF_UP));

    }
}
