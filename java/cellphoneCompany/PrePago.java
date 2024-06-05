import java.util.GregorianCalendar;

public class PrePago extends Assinante {
    private Recarga[] recargas;
    private int numRecargas;
    private float creditos;
    
    public PrePago(long cpf, String nome, String numero) {
        super(cpf, nome, numero);
        this.recargas = new Recarga[100];
        this.numRecargas = 0;
        this.creditos = 0;
    }

    public void fazerChamada(GregorianCalendar data, int duracao) {
        float custo = duracao * 1.45f;
        if (custo > creditos) {
            System.out.println("Não há créditos suficientes para realizar a chamada");
        } else if (numChamadas >= chamadas.length) {
            System.out.println("Você ultrapassou o número de chamadas");
        } else {
            chamadas[numChamadas] = new Chamada(data, duracao);
            numChamadas += 1;
            creditos -= custo;
        }
    }

    public void recarregar(GregorianCalendar data, float valor) {
        if (numRecargas < recargas.length) {
            recargas[numRecargas] = new Recarga(data, valor);
            creditos += valor;
            numRecargas += 1;
        } else {
            System.out.println("Você excedeu o número de recargas");
        }
    }

    public void imprimirFatura(int mes) {

        float totalChamadas = 0;
        float totalRecargas = 0;

        System.out.println(this);

        System.out.println("Chamadas:");
        for (int i = 0; i < numChamadas; i++) {
            Chamada chamada = chamadas[i];
            if (chamada.getData().get(GregorianCalendar.MONTH) == mes) {
                System.out.println(chamada);
                totalChamadas += chamada.getDuracao() * 1.45f;
            }
        }

        System.out.println("Recargas:");
        for (int i = 0; i < numRecargas; i++) {
            Recarga recarga = recargas[i];
            if (recarga.getData().get(GregorianCalendar.MONTH) == mes) {
                System.out.println(recarga);
                totalRecargas += recarga.getValor();
            }
        }

        System.out.println(String.format("Total de chamadas: R$ %f", totalChamadas));
        System.out.println(String.format("Total de recargas: R$ %f", totalRecargas));
        System.out.println(String.format("Créditos: %f", creditos));
    }
}