public class Empresa {

  // Declarar atributos
    private String razaoSocial;
    private String cnpj;
    private String fone;

    //SETTERS

    // Método para atribuir razão social da empresa
    public void setRazaoSocial(String razaoSocial) {
      this.razaoSocial = razaoSocial;
    }
    
    // Método para atribuir telefone da empresa
    public void setFone(String fone) {
      this.fone = fone;
    }
    
    // Método para atribuir CNPJ da empresa
    public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
    }

    // GETTERS
  
    // Método para obter razão social da empresa
    public String getRazaoSocial() {
      return this.razaoSocial;
    }
    
    // Método para obter CNPJ da empresa
    public String getCnpj() {
      return this.cnpj;
    }
    
    // Método para obter telefone da empresa
    public String getFone() {
      return this.fone;
    }
  }