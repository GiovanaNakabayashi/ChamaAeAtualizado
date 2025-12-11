
package model;

public class prestadores {
    private int id;
    private String nome;
    private String rg;
    private String servico;
    private String contato;
    private String cidade;
    private int cadastro;

 public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getServico() {
        return servico;
    }

    public String getContato() {
        return contato;
    }
     
    public String getCidade() {
        return cidade;
    }
    public int getCadastro() {
      return cadastro;
      
   ////
   
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     public void setRg(String rg) {
        this.rg = rg;
    }
     
    public void setServico(String servico) {
        this.servico = servico;
    }
     public void setContato(String contato) {
        this.contato = contato;
    }
      public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

}


