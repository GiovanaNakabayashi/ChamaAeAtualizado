
package controller;

import model.Usuarios;
import service.UsuarioService;

public class TelaProcuraController {

    private final UsuarioService usuarioService;

    public TelaProcuraController() {
        this.usuarioService = new UsuarioService();
    }

    public Usuarios buscarUsuarioLogado(int cadastroId) throws Exception {
        return usuarioService.buscarPorCadastroId(cadastroId);
    }
}   

