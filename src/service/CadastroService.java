package service;

import dao.CadastroDAO;
import model.Cadastro;
import java.sql.SQLException;

public class CadastroService {

    private final CadastroDAO cadastroDAO;

    public CadastroService() {
        this.cadastroDAO = new CadastroDAO();
    }


    public int cadastrar(Cadastro cadastro) throws SQLException, IllegalArgumentException, Exception {
        validarCadastro(cadastro);  // chama a validação antes de inserir
        return cadastroDAO.inserir(cadastro);
    }

     private void validarCadastro(Cadastro c) throws Exception {
        if (c.getLogin() == null || c.getLogin().isBlank()) {
            throw new IllegalArgumentException("O login não pode estar vazio.");
        }

        if (c.getSenha() == null || c.getSenha().length() < 4) {
            throw new Exception("A senha deve ter pelo menos 4 caracteres.");
        }

        if (c.getStatus() == null || c.getStatus().isBlank()) {
            c.setStatus("ativo"); 
    }
     }}