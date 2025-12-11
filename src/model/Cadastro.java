package model;

public class Cadastro {

    private Integer id;
    private String login;
    private String senha;
    private String status;

    public Cadastro() {}

    public Cadastro(Integer id, String login, String senha, String status) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
