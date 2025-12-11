package service;

import dao.CadastroDAO;
import model.Cadastro;

import java.sql.SQLException;

public class CadastroService {

    private final CadastroDAO cadastroDAO;

    public CadastroService() {
        this.cadastroDAO = new CadastroDAO();
    }

    public int cadastrar(Cadastro cadastro) throws SQLException {
        // Validação básica
        if (cadastro.getLogin() == null || cadastro.getLogin().isEmpty()) {
            throw new IllegalArgumentException("Login é obrigatório.");
        }
        if (cadastro.getSenha() == null || cadastro.getSenha().isEmpty()) {
            throw new IllegalArgumentException("Senha é obrigatória.");
        }
        if (cadastro.getStatus() == null || cadastro.getStatus().isEmpty()) {
            throw new IllegalArgumentException("Tipo de cadastro é obrigatório.");
        }

        // Insere no banco
        return cadastroDAO.inserir(cadastro);
    }


    // Regras de validação (responsabilidade do Service, não da View)
    private void validarCadastro(Cadastro c) throws Exception {
        if (c.getLogin() == null || c.getLogin().isBlank()) {
            throw new Exception("O login não pode estar vazio.");
        }

        if (c.getSenha() == null || c.getSenha().length() < 4) {
            throw new Exception("A senha deve ter pelo menos 4 caracteres.");
        }

        if (c.getStatus() == null || c.getStatus().isBlank()) {
            c.setStatus("ativo"); // valor padrão opcional
        }
    }
}
