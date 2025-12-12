
package service;

import dao.UsuarioDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import model.Usuarios;

public class UsuarioService {
    
    private final UsuarioDAO dao;
    
        public UsuarioService() {
        this.dao = new UsuarioDAO();
    }

    public void cadastrarUsuario(Usuarios usuario, int cadastroId) throws SQLException {
        try (Connection conexao = Conexao.conectar()) {
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
            usuarioDAO.inserir(usuario, cadastroId);
        }
    }
    
   
    public Usuarios buscarPorCadastroId(int cadastroId) throws SQLException {
        try (Connection conexao = Conexao.conectar()) {
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
            return usuarioDAO.buscarPorCadastroId(cadastroId);
        }
    }


      public void atualizar(Usuarios usuario) throws Exception {

    if (usuario.getNome() == null || usuario.getNome().isBlank()) {
        throw new IllegalArgumentException("Nome não pode estar vazio.");
    }

    try (Connection conexao = Conexao.conectar()) {
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
        usuarioDAO.atualizar(usuario);
    }// outras validações
        dao.atualizar(usuario);
    }
}

        
        

