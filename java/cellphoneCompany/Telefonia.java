import java.text.SimpleDateFormat;
import java.util.*;

public class Telefonia {
    private PrePago[] prePagos;
    private int numPrePagos;
    private PosPago[] posPagos;
    private int numPosPagos;

    public Telefonia() {
        prePagos = new PrePago[100];
        numPrePagos = 0;
        posPagos = new PosPago[100];
        numPosPagos = 0;
    }

    public void cadastrarAssinante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo de assinante (1- Pré-pago, 2- Pós-pago):");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // consume the newline

        System.out.println("CPF:");
        long cpf = scanner.nextLong();
        scanner.nextLine();  // consume the newline

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Número:");
        String numero = scanner.nextLine();

        if (tipo == 1) {
            if (numPrePagos < prePagos.length) {
                prePagos[numPrePagos++] = new PrePago(cpf, nome, numero);
            } else {
                System.out.println("Não há mais espaço para cadastrar assinantes pré-pagos.");
            }
        } else {
            if (numPosPagos < posPagos.length) {
                System.out.println("Valor da assinatura:");
                float assinatura = scanner.nextFloat();
                posPagos[numPosPagos++] = new PosPago(cpf, nome, numero, assinatura);
            } else {
                System.out.println("Não há mais espaço para cadastrar assinantes pós-pagos.");
            }
        }
    }

    public void listarAssinantes() {
        System.out.println("Assinantes Pré-Pagos:");
        for (int i = 0; i < numPrePagos; i++) {
            System.out.println(prePagos[i]);
        }

        System.out.println("Assinantes Pós-Pagos:");
        for (int i = 0; i < numPosPagos; i++) {
            System.out.println(posPagos[i]);
        }
    }

    public void fazerChamada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo de assinante (1- Pré-pago, 2- Pós-pago):");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // consume the newline

        System.out.println("CPF:");
        long cpf = scanner.nextLong();
        scanner.nextLine();  // consume the newline

        System.out.println("Data da chamada (dd/MM/yyyy):");
        String dataStr = scanner.nextLine();
        GregorianCalendar data = new GregorianCalendar();
        try {
            data.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(dataStr));
        } catch (Exception e) {
            System.out.println("Data inválida.");
            return;
        }

        System.out.println("Duração (minutos):");
        int duracao = scanner.nextInt();

        if (tipo == 1) {
            PrePago assinante = localizarPrePago(cpf);
            if (assinante != null) {
                assinante.fazerChamada(data, duracao);
            } else {
                System.out.println("Assinante pré-pago não encontrado.");
            }
        } else {
            PosPago assinante = localizarPosPago(cpf);
            if (assinante != null) {
                assinante.fazerChamada(data, duracao);
            } else {
                System.out.println("Assinante pós-pago não encontrado.");
            }
        }
    }

    public void fazerRecarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CPF do assinante pré-pago:");
        long cpf = scanner.nextLong();
        scanner.nextLine();  // consume the newline

        System.out.println("Data da recarga (dd/MM/yyyy):");
        String dataStr = scanner.nextLine();
        GregorianCalendar data = new GregorianCalendar();
        try {
            data.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(dataStr));
        } catch (Exception e) {
            System.out.println("Data inválida.");
            return;
        }

        System.out.println("Valor da recarga:");
        float valor = scanner.nextFloat();

        PrePago assinante = localizarPrePago(cpf);
        if (assinante != null) {
            assinante.recarregar(data, valor);
        } else {
            System.out.println("Assinante pré-pago não encontrado.");
        }
    }

    public PrePago localizarPrePago(long cpf) {
        for (int i = 0; i < numPrePagos; i++) {
            if (prePagos[i].getCpf() == cpf) {
                return prePagos[i];
            }
        }
        return null;
    }

    public PosPago localizarPosPago(long cpf) {
        for (int i = 0; i < numPosPagos; i++) {
            if (posPagos[i].getCpf() == cpf) {
                return posPagos[i];
            }
        }
        return null;
    }

    public void imprimirFaturas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mês (1-12):");
        int mes = scanner.nextInt();

        System.out.println("Faturas dos assinantes pré-pagos:");
        for (int i = 0; i < numPrePagos; i++) {
            prePagos[i].imprimirFatura(mes);
        }

        System.out.println("Faturas dos assinantes pós-pagos:");
        for (int i = 0; i < numPosPagos; i++) {
            posPagos[i].imprimirFatura(mes);
        }
    }
}
