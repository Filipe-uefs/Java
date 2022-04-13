import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LojaTest {

    @Test
    public void deveriaRetornarQuantidadeDeFuncionariosIgualADois() {

        Loja loja = new Loja();
        loja.addFuncionario("Filipe Pereira");
        loja.addFuncionario("Carlos Eduardo");

        assertEquals(loja.getQtdFuncionarios(), 2);
    }
}
