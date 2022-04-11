package JUnit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerTresPorcentoQuandoDesempenhoForAbaixo() {
        Funcionario funcionario = new Funcionario("Filipe", new BigDecimal(2000), 444081);
        ReajusteService service = new ReajusteService();
        service.reajustar(funcionario, Desempenho.ABAIXO);

        assertEquals(funcionario.getSalario(), new BigDecimal("2060.00"));
    }

    @Test
    public void reajusteDeveriaSerDezPorcentoQuandoDesempenhoForNaMedia() {
        Funcionario funcionario = new Funcionario("Filipe", new BigDecimal(2000), 444081);
        ReajusteService service = new ReajusteService();
        service.reajustar(funcionario, Desempenho.NA_MEDIA);

        assertEquals(funcionario.getSalario(), new BigDecimal("2200.00"));
    }

    @Test
    public void reajusteDeveriaSerTrintaPorcentoQuandoDesempenhoForAcima() {
        Funcionario funcionario = new Funcionario("Filipe", new BigDecimal(2000), 444081);
        ReajusteService service = new ReajusteService();
        service.reajustar(funcionario, Desempenho.ACIMA);

        assertEquals(funcionario.getSalario(), new BigDecimal("2600.00"));
    }


}
