
package model;

import dao.Conexao;
import dao.LoginDAO;
import service.CadastroService;
import service.PrestadorService;


//Classe para testes


public class main {

    public static void main(String[] args) throws Exception {

        System.out.println("===== INÍCIO DOS TESTES =====");

        testarConexao();
        testarCadastro();
        testarLogin();
        testarBuscaPrestadores();

        System.out.println("===== FIM DOS TESTES =====");
    }

    // ---------------- TESTES --------------------

    private static void testarConexao() {
        System.out.println("Teste 1 – Conexão com banco:");
        try {
            if (Conexao.conectar() != null) {
                System.out.println("OK: Conexão realizada com sucesso.");
            } else {
                System.out.println("FALHOU: Conexão retornou null.");
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    private static void testarCadastro() throws Exception {
        System.out.println("\nTeste 2 – Cadastro de usuário:");

        CadastroService service = new CadastroService();
        Cadastro novo = new Cadastro();

        // Ajuste os campos reais da classe Cadastro
        novo.setLogin("Teste");
        novo.setSenha("teste1234");

  int resultado = service.cadastrar(novo);

if (resultado > 0) {
    System.out.println("OK: Cadastro realizado.");
} else {
    System.out.println("FALHOU: Erro ao cadastrar.");
}
    }

    private static void testarLogin() {
        System.out.println("\nTeste 3 – Login:");

        LoginDAO loginDAO = new LoginDAO();

        Cadastro usuario = loginDAO.autenticar("teste", "teste1234");

        if (usuario != null) {
            System.out.println("OK: Login bem-sucedido.");
        } else {
            System.out.println("FALHOU: Login retornou null.");
        }
    }

    private static void testarBuscaPrestadores() throws Exception {
        System.out.println("\nTeste 4 – Busca de prestadores:");

        PrestadorService prestadorService = new PrestadorService();

        var lista = prestadorService.listarTodos();

        if (lista != null && !lista.isEmpty()) {
            System.out.println("OK: Foram encontrados " + lista.size() + " prestadores.");
        } else {
            System.out.println("FALHOU: Nenhum prestador encontrado.");
        }
    }

    }

