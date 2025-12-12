
package service;

import model.Usuarios;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;


public class UsuarioServiceTest {
    
    public UsuarioServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

        @org.junit.Test
    public void deveValidarPrestadorValido() {
        UsuarioService service = new UsuarioService();

        Usuarios u = new Usuarios();
        u.setNome("Maria Silva");
        u.setCpf("12345678901");

        boolean resultado = service.validarUsuario(u);

        assertTrue(resultado);
    }

    @org.junit.Test
    public void naoDeveValidarNomeVazio() {
        UsuarioService service = new UsuarioService();

        Usuarios u = new Usuarios();
        u.setNome("");
        u.setCpf("12345678901");

        boolean resultado = service.validarUsuario(u);

        assertFalse(resultado);
    }

    @org.junit.Test
    public void naoDeveValidarCpfInvalido() {
        UsuarioService service = new UsuarioService();

        Usuarios u = new Usuarios();
        u.setNome("Maria");
        u.setCpf("123"); // CPF inválido

        boolean resultado = service.validarUsuario(u);

        assertFalse(resultado);
    }
}

    
