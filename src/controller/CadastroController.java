package controller;

import model.Cadastro;
import model.Usuarios;
import model.prestadores;
import service.CadastroService;
import java.sql.SQLException;
import service.PrestadorService;
import service.UsuarioService;

public class CadastroController {

    private final CadastroService cadastroService;
    private final UsuarioService usuarioService;
    private final PrestadorService prestadorService;

    public CadastroController() {
        this.cadastroService = new CadastroService();
        this.usuarioService = new UsuarioService();
        this.prestadorService = new PrestadorService();
    }

    public int cadastrarCadastro(Cadastro cadastro) throws SQLException, Exception {
        return cadastroService.cadastrar(cadastro);
    }

    public void cadastrarUsuario(Usuarios usuario, int cadastroId) throws SQLException {
        if (usuario.getNome().isEmpty() || usuario.getCpf().isEmpty()
                || usuario.getEndereco().isEmpty() || usuario.getContato().isEmpty()) {
            throw new IllegalArgumentException("Todos os campos do Usuário devem ser preenchidos.");
        }
        usuarioService.cadastrarUsuario(usuario, cadastroId);
    }

    public void cadastrarPrestador(prestadores prestador, int cadastroId) throws SQLException {
        if (prestador.getNome().isEmpty() || prestador.getRg().isEmpty()
                || prestador.getServico().isEmpty() || prestador.getCidade().isEmpty()
                || prestador.getContato().isEmpty()) {
            throw new IllegalArgumentException("Todos os campos do Prestador devem ser preenchidos.");
        }
        prestadorService.cadastrarPrestador(prestador, cadastroId);
    }
}

