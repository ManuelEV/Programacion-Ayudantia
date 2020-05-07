import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora c;

    @Before
    public void setUp() throws Exception {
        c = new Calculadora(6, 2);
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sumar() {

        int resultadoEsperado = 6;

        int resultado = c.sumar();

        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void restar() {
    }

    @Test
    public void multiplicar() {
        int resultadoEsperado = 12;
        int resultado = c.multiplicar();

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void dividir() {
    }

    @Test
    public void potencia() {
    }
}