import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Criar objeto da classe Scanner
    Scanner scan = new Scanner(System.in);

    // Criar objeto da classe Empregado
    Empregado empregado = new Empregado();

    // Informar e atribuir nome do empregado
    System.out.println("Informe o nome do empregado:");
    empregado.setNome(scan.nextLine());

    // Informar e atribuir salário do empregado
    System.out.println("Informe o salário do empregado:");
    empregado.setSalario(scan.nextDouble());

    // Ler linha pendente no buffer do Scanner
    scan.nextLine();

    // Criar objeto da classe Empresa
    Empresa empresa = new Empresa();

    // Informar e atribuir nome da empresa
    System.out.println("Informe o nome da empresa:");
    empresa.setRazaoSocial(scan.nextLine());

    // Informar e atribuir cnpj da empresa
    System.out.println("Informe o cnpj da empresa:");
    empresa.setCnpj(scan.nextLine());

    // Informar e atribuir telefone da empresa
    System.out.println("Informe o telefone da empresa:");
    empresa.setFone(scan.nextLine());

    // Atribuir empresa ao empregado
    empregado.setEmpresa(empresa);

    // Exibir informações cadastradas
    System.out.println("\nDados cadastrados:\n");
    System.out.println("Nome do empregado: " + empregado.getNome());
    System.out.println("Salário do empregado: " + empregado.getSalario());
    System.out.println("Nome da empresa: " + empregado.getEmpresa().getRazaoSocial());
    System.out.println("CNPJ da empresa: " + empregado.getEmpresa().getCnpj());
    System.out.println("Telefone da empresa: " + empregado.getEmpresa().getFone());

    // Fechar scanner
    scan.close();
  }
}