
package dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cadastro;


public class LoginDAO {
    
private final Connection conexao;

  public LoginDAO(Connection conexao) {
    this.conexao = conexao;
    }

    public Cadastro autenticar(String login, String senha) {
    String sql = "SELECT * FROM cadastro WHERE login = ? AND senha = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
     stmt.setString(1, login);
     stmt.setString(2, senha);
     ResultSet rs = stmt.executeQuery();
      
     if (rs.next()) {
            Cadastro cadastro = new Cadastro();
            cadastro.setId(rs.getInt("idcadastro"));
            cadastro.setLogin(rs.getString("login"));
            cadastro.setSenha(rs.getString("senha"));
            cadastro.setStatus(rs.getString("status"));
            return cadastro;
        } else {
            return null;
        }
        } catch (SQLException e) {
        e.printStackTrace();
        return null;
        }
    
    }}
