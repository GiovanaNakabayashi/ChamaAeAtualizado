package controller;

import dao.UsuarioDAO;
import dao.prestadoresDAO;
import dao.Conexao;
import model.Cadastro;
import model.Usuarios;
import model.prestadores;
import service.CadastroService;

import java.sql.Connection;
import java.sql.SQLException;

public class CadastroController {

    private final CadastroService cadastroService;

    public CadastroController() {
        this.cadastroService = new CadastroService();
    }

    // Retorna o ID do cadastro principal
    public int cadastrarCadastro(Cadastro cadastro) throws SQLException {
        return cadastroService.cadastrar(cadastro);
    }

    public void cadastrarUsuario(Usuarios usuario, int cadastroId) throws SQLException {
        // Validação de campos obrigatórios
        if (usuario.getNome().isEmpty() || usuario.getCpf().isEmpty()
                || usuario.getEndereco().isEmpty() || usuario.getContato().isEmpty()) {
            throw new IllegalArgumentException("Todos os campos do Usuário devem ser preenchidos.");
        }

        Connection conexao = Conexao.conectar();
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
        usuarioDAO.inserir(usuario, cadastroId);
    }

    public void cadastrarPrestador(prestadores prestador, int cadastroId) throws SQLException {
        // Validação de campos obrigatórios
        if (prestador.getNome().isEmpty() || prestador.getRg().isEmpty()
                || prestador.getServico().isEmpty() || prestador.getCidade().isEmpty()
                || prestador.getContato().isEmpty()) {
            throw new IllegalArgumentException("Todos os campos do Prestador devem ser preenchidos.");
        }

        Connection conexao = Conexao.conectar();
        prestadoresDAO prestadorDAO = new prestadoresDAO(conexao);
        prestadorDAO.inserir(prestador, cadastroId);
    }
}
