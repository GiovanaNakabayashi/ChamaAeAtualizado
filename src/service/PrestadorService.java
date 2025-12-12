
package service;

import dao.prestadoresDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import model.prestadores;

public class PrestadorService {

       private final prestadoresDAO dao;
    
        public PrestadorService() {
        this.dao = new prestadoresDAO();
    }

    public void cadastrarPrestador(prestadores prestador, int cadastroId) throws SQLException {
        try (Connection conexao = Conexao.conectar()) {
            prestadoresDAO prestadoresDAO = new prestadoresDAO(conexao);
            prestadoresDAO.inserir(prestador, cadastroId);
        }
    }
    public List<prestadores> listarTodos() throws Exception {
        return dao.listarPrestadores();
    }
      public void atualizar(prestadores prestador) throws Exception {
        if (prestador.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome não pode estar vazio.");
        }
        // outras validações
        dao.atualizar(prestador);
}
      public boolean validarPrestador(prestadores p) {
    if (p == null) return false;
    if (p.getNome() == null || p.getNome().isEmpty()) return false;
    if (p.getRg() == null || p.getRg().length() != 9) return false;
    return true;
}
}
