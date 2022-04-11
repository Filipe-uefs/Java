package JUnit;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal percentual = new BigDecimal("0.1");
        BigDecimal bonus = funcionario.getSalario().multiply(percentual);

        if(bonus.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("Funcionario com salario mais que 10000, não deveria ocorrer");
        }

        return bonus;
    }
}
