import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class UtilidadTest {

    private Utilidad utilidad;

    @Before
    public void setUp() throws Exception {
        utilidad = new Utilidad();
    }

    @After
    public void tearDown() throws Exception {
        utilidad = null;
    }

    @Test
    public void parseInt() {
        utilidad.parseInt("UFRO");
        utilidad.parseInt(null);
        utilidad.parseInt("-1");
        utilidad.parseInt("");
    }

    @Test
    public void validarFormatoFecha() {

        System.out.println(utilidad.validarFormatoFecha(null));

    }

    @Test
    public void crearNuevaFecha() throws ParseException {

        utilidad.crearNuevaFecha("jaslifjasoihudiugas fhas9rfusdoghsdo");

    }

    @Test
    public void obtenerDatoArray() {

        String arreglo[] = {"valor1", "valor2", "valor3"};
        int index = -1;

        utilidad.obtenerDatoArray(arreglo, index);

        System.out.println("Hola");
    }
}