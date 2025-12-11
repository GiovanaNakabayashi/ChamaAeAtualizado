
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cadastro;

public class CadastroDAO {

    private final Connection conexao;

    // Injeção de dependência (DIP)
    public CadastroDAO(Connection conexao) {
        this.conexao = conexao;
    }

    // Construtor padrão usando a classe Conexao
    public CadastroDAO() {
        try {
            this.conexao = Conexao.conectar();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }

    // Inserir novo cadastro e retornar ID gerado
    public int inserir(Cadastro cadastro) throws SQLException {

        final String sql = "INSERT INTO cadastro (login, senha, status) VALUES (?, ?, ?)";

        try (PreparedStatement stmt =
                conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, cadastro.getLogin());
            stmt.setString(2, cadastro.getSenha());
            stmt.setString(3, cadastro.getStatus());

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }

            throw new SQLException("Não foi possível obter o ID do cadastro.");
        }
    }
}
