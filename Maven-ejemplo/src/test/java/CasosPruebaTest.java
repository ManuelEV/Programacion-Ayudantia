import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CasosPruebaTest {

    private CasosPrueba c;

    @Before
    public void setUp() throws Exception {
        c = new CasosPrueba();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void esPalindromo() {

        String palabraPrueba = "ajitragalalagartija";

        //boolean resultadoEsperado = false;

        assertEquals(true, c.esPalindromo(palabraPrueba));

    }

    @Test
    public void randomEntre(){

        int min = 100;
        int max = 100;

        int resultado = c.randomEntre(min, max);
        System.out.println(resultado);
        if (resultado <= max && resultado>=min){
            assertTrue(true);
        }else {
            fail();
        }

    }

}