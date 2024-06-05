import java.util.GregorianCalendar;

public class PosPago extends Assinante {
    private float assinatura;

    public PosPago(long cpf, String nome, String numero, float assinatura) {
        super(cpf, nome, numero);
        this.assinatura = assinatura;
    }

    public void fazerChamada(GregorianCalendar data, int duracao) {
        if (numChamadas > chamadas.length) {
            System.out.println("Número de chamadas excedido");
        } 
        else {
            chamadas[numChamadas] = new Chamada(data, duracao);
        }
    }

    public void imprimirFatura(int mes) {
        float totalChamadas = 0;

        System.out.println(this);

        for (int i = 0; i < numChamadas; i++) {
            Chamada chamada = chamadas[i];
            if (chamada.getData().get(GregorianCalendar.MONTH) == mes) {
                System.out.println(chamada);
                totalChamadas = chamada.getDuracao() * 1.04f;
            }
        }

        System.out.println(String.format("Total de chamadas: R$ %f", totalChamadas));
        System.out.println(String.format("Assinatura: R$ %f", assinatura));
        System.out.println(String.format("Total da fatura: R$ %f", totalChamadas + assinatura));
    }
}