
package service;

import model.prestadores;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrestadorServiceTest {
    
    public PrestadorServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deveValidarPrestadorValido() {
        PrestadorService service = new PrestadorService();

        prestadores p = new prestadores();
        p.setNome("João Silva");
        p.setRg("12345678901");

        boolean resultado = service.validarPrestador(p);

        assertTrue(resultado);
    }

    @Test
    public void naoDeveValidarNomeVazio() {
        PrestadorService service = new PrestadorService();

        prestadores p = new prestadores();
        p.setNome("");
        p.setRg("12345678901");

        boolean resultado = service.validarPrestador(p);

        assertFalse(resultado);
    }

    @Test
    public void naoDeveValidarRgInvalido() {
        PrestadorService service = new PrestadorService();

        prestadores p = new prestadores();
        p.setNome("Maria");
        p.setRg("123"); // RG inválido

        boolean resultado = service.validarPrestador(p);

        assertFalse(resultado);
    }
}


