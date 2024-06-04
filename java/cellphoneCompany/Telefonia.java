import java.util.Scanner;

public class Telefonia {
    private PrePago[] prePagos;
    private PosPago[] posPagos;
    private int numPrePagos;
    private int numPosPagos;

    public Telefonia() {
        this.prePagos = new PrePago[100];
        this.posPagos = new PosPagos[100];
    }

    public void cadastrarAssinante() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o CPF do assinante: ");
        long cpf = scan.nextLong();

        System.out.println("Informe o nome do assinante: ");
        String nome = scan.next();

        System.out.println("Informe o número do assinante: ");
        String numero = scan.next();

        while (true) {
            System.out.println("""
                Qual tipo de assinante você deseja cadastrar?
                1 - Pré Pago
                2 - Pós Pago
                3 - Cancelar cadastro e sair
                """);
                int opcao = scan.nextInt();
                if (opcao < 1 || opcao > 3) {
                    System.out.println("Opção inválida");
                    continue;
                } else if (opcao == 1) {
                    prePagos[numPrePagos] = new PrePago(cpf, nome, numero);
                    numPrePagos += 1;
                    break;
                } else if (opcao == 2) {
                    System.out.println("Qual é o valor da assinatura pós-paga?");
                    float assinatura = scan.nextFloat();
                    posPagos[numPosPagos] = new PosPago(cpf, nome, numero, assinatura);
                    numPosPagos += 1;
                    break;
                } else {
                    System.out.println("Cadastro cancelado");
                    break;
                }

        }
        
        
    }

    public void listarAssinantes() {
        System.out.println("\nAssinantes pré-pagos:");
        for (int i = 0; i < numPrePagos; i++) {
            System.out.println(prePagos[0].toString());
        }

        System.out.println("\nAssinantes pós-pagos:");
        for (int i = 0; i < numPosPagos; i++) {
            System.out.println(posPagos[0].toString());
        }
    }

    public void fazerChamada() {
        while (true) {
            System.out.println("Informe o CPF do assinante:");
            long cpf = scan.nextLong();
            System.out.println("""
                Qual tipo de assinante que realizará a chamada?
                1 - Pré Pago
                2 - Pós Pago
                3 - Cancelar chamada e sair
                """);
                int opcao = scan.nextInt();
                if (opcao < 1 || opcao > 3) {
                    System.out.println("Opção inválida");
                    continue;
                } else if (opcao == 1) {
                    PrePago prePago = localizarPrePago(cpf);
                    if (prePago == null) {
                        System.out.println("Assinante pré-pago não localizado");
                    } else {
                        
                    }
                }
                

        }
    }

}