
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.prestadores;


public class prestadoresDAO {
    private Connection conexao;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<prestadores> lista = new ArrayList<>();
    

    
    public prestadoresDAO(Connection conexao) {
       
       this.conexao = conexao;
  }
     
    public prestadoresDAO() {
        try {
            this.conexao = Conexao.conectar();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }
    public void inserir(prestadores prestador, int cadastro) {
        String sql = "INSERT INTO prestadores (nome, rg, servico, contato, cidade, idcadastro) VALUES (?,?,?,?,?,?)";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)){
            
            stmt.setString(1, prestador.getNome());
            stmt.setString(2, prestador.getRg());
            stmt.setString(3, prestador.getServico());
            stmt.setString(4, prestador.getContato());
            stmt.setString(5, prestador.getCidade());
            stmt.setInt(6, cadastro);
            
            stmt.executeUpdate();
            System.out.println("Prestador cadastrado com sucesso!");
            
        }  catch (SQLException e) {
         System.err.println("Erro ao inserir Prestador: " + e.getMessage());
        }
    }
     public ArrayList<prestadores> listarPrestadores(){
       String sql = "SELECT * FROM prestadores";
        lista = new ArrayList<>();
        
        
        try {
        conexao = Conexao.conectar();
        prep = conexao.prepareStatement(sql);
        resultset = prep.executeQuery();


        while (resultset.next()) {
            prestadores prestador = new prestadores();
            prestador.setNome(resultset.getString("nome"));
            prestador.setServico(resultset.getString("servico"));
            prestador.setContato(resultset.getString("contato"));
            prestador.setCidade(resultset.getString("cidade"));

            lista.add(prestador);
        }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao listar Prestadores: " + e.getMessage());
        }
    
    return lista;
    }
     
    public prestadores buscarPorCadastroId(int cadastroId) {
    String sql = "SELECT * FROM prestadores WHERE idcadastro = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setInt(1, cadastroId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            prestadores p = new prestadores();
            p.setNome(rs.getString("nome"));
            p.setRg(rs.getString("rg"));
            p.setServico(rs.getString("servico"));
            p.setContato(rs.getString("contato"));
            p.setCidade(rs.getString("cidade"));
            return p;
        }
    }  catch (SQLException e) {
        System.err.println("Erro ao buscar prestador: " + e.getMessage());
}
    return null;
}
       public void atualizar(prestadores prestadores) {
    String sql = "UPDATE prestadores SET nome = ?, rg = ?,servico = ?, contato = ?, cidade = ? WHERE idcadastro= ?";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, prestadores.getNome());
        stmt.setString(2, prestadores.getRg());
        stmt.setString(3, prestadores.getServico());
        stmt.setString(4, prestadores.getContato());
        stmt.setString(5, prestadores.getCidade());
        stmt.setInt(6, prestadores.getCadastro());

        stmt.executeUpdate();
        System.out.println("Cadastro atualizado com sucesso!");
    } catch (SQLException e) {
        System.err.println("Erro ao atualizar: " + e.getMessage());
    }
}
}
