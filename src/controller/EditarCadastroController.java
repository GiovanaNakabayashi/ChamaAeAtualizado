
package controller;

import model.Usuarios;
import model.prestadores;
import service.UsuarioService;
import service.PrestadorService;

public class EditarCadastroController {

    private final UsuarioService usuarioService;
    private final PrestadorService prestadorService;

    public EditarCadastroController() {
        this.usuarioService = new UsuarioService();
        this.prestadorService = new PrestadorService();
    }

    public void atualizarUsuario(Usuarios usuario) throws Exception {
        usuarioService.atualizar(usuario);
    }

    public void atualizarPrestador(prestadores prestador) throws Exception {
        prestadorService.atualizar(prestador);
    }
}
