public class Acao extends InstrumentoFinanceiro {
    private int cotas;

    public Acao(float saldo, int cotas) {
        super(saldo);
        this.cotas = cotas;
    }

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    @Override
    public float calcularSaldoTotal() {
        return getSaldo() * cotas;
    }
}