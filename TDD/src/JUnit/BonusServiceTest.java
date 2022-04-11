package JUnit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    public void deveriaRetornarZeroParaBonusMuitoAlto() {

        Funcionario funcionario = new Funcionario("Filipe", new BigDecimal(50000), 13333);
        BigDecimal bonus = new BonusService().calcularBonus(funcionario);

        assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test
    public void deveriaRetornarBonusDeDezPorcentoDoSalario() {

        Funcionario funcionario = new Funcionario("Filipe", new BigDecimal(5000), 13333);
        BigDecimal bonus = new BonusService().calcularBonus(funcionario);

        assertEquals(new BigDecimal("500.0"), bonus);
    }

    @Test
    public void deveriaRetornarBonusDeDezPorcentoParaSalarioDe10000() {

        Funcionario funcionario = new Funcionario("Filipe", new BigDecimal(10000), 13333);
        BigDecimal bonus = new BonusService().calcularBonus(funcionario);

        assertEquals(new BigDecimal("1000.0"), bonus);
    }

}
