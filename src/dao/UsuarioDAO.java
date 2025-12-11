
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuarios;


public class UsuarioDAO {
    private final Connection conexao;

    
    public UsuarioDAO(Connection conexao) {
       this.conexao = conexao;
  }
     
    public UsuarioDAO() {
        try {
            this.conexao = Conexao.conectar();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }

    public void inserir(Usuarios usuario, int cadastro) {
        String sql = "INSERT INTO usuarios (nome, cpf, contato,endereco, cadastro_id) VALUES (?,?,?,?,?)";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)){
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getContato());
            stmt.setString(4, usuario.getEndereco());
            stmt.setInt(5, cadastro);
            
            stmt.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso!");
            
        }  catch (SQLException e) {
         System.err.println("Erro ao inserir usuário: " + e.getMessage());
        }
    }
    public Usuarios buscarPorCadastroId(int cadastroId) {
    String sql = "SELECT * FROM usuarios WHERE cadastro_id = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setInt(1, cadastroId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Usuarios u = new Usuarios();
             u.setNome(rs.getString("nome"));
            u.setCpf(rs.getString("cpf"));
            u.setEndereco(rs.getString("endereco"));
            u.setContato(rs.getString("contato"));
            
            return u;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}
    public void atualizar(Usuarios usuario) {
    String sql = "UPDATE usuarios SET nome = ?, cpf = ?, contato = ?, endereco = ? WHERE cadastro_id = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getCpf());
        stmt.setString(3, usuario.getContato());
        stmt.setString(4, usuario.getEndereco());
        stmt.setInt(5, usuario.getCadastro());

        stmt.executeUpdate();
        System.out.println("Cadastro atualizado com sucesso!");
    } catch (SQLException e) {
        System.err.println("Erro ao atualizar: " + e.getMessage());
    }
}
}
