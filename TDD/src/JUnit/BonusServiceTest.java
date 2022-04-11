package JUnit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BonusServiceTest {

    @Test
    public void deveriaRetornarExceptionParaBonusMuitoAlto() {

        Funcionario funcionario = new Funcionario("Filipe", new BigDecimal(50000), 13333);
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(funcionario));

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
