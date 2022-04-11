package JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos() {

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(16, 1);

        assertEquals(17, soma);
        
    }
}
