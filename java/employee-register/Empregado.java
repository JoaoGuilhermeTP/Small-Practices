public class Empregado {

    // Declarar atributos
    private String nome;
    private double salario;
    private Empresa empresa;

    // SETTERS

    // Método para atribuir nome do empregado
    public void setNome(String nome) {
      this.nome = nome;
    }
    
    // Método para atribuir salário do empregado
    public void setSalario(double salario) {
      this.salario = salario;
    }
    
    // Método para atribuir empresa do empregado
    public void setEmpresa(Empresa empresa) {
      this.empresa = empresa;
    }
    
    // GETTERS

    // Método para obter nome do empregado
    public String getNome() {
      return this.nome;
    }
    
    // Método para obter salário do empregado
    public double getSalario() {
      return this.salario;
    }
  
    // Método para obter empresa do empregado
    public Empresa getEmpresa() {
      return this.empresa;
    }
  }