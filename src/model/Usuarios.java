
package model;

public class Usuarios {
    private int id;
    private String nome;
    private String cpf;
    private String contato;
    private String endereco;
    private int cadastro;
  
 
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getContato() {
        return contato;
    }

     public String getEndereco() {
        return endereco;
     }
    public int getCadastro() {
        return cadastro;
    
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     public void setContato(String contato) {
        this.contato = contato;
    }
      public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

}
