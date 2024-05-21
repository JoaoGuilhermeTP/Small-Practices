import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<InstrumentoFinanceiro> instrumentos;

    public Banco() {
        this.instrumentos = new ArrayList<>();
    }

    public void adicionar(InstrumentoFinanceiro instrumento) {
        this.instrumentos.add(instrumento);
    }

    public float calcularSaldos() {
        float total = 0;
        for (InstrumentoFinanceiro instrumento : instrumentos) {
            total += instrumento.calcularSaldoTotal();
        }
        return total;
    }
}