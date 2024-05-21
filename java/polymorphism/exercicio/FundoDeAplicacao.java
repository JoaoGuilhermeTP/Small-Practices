public class FundoDeAplicacao extends InstrumentoFinanceiro {
    private float rentabilidade;

    public FundoDeAplicacao(float saldo, float rentabilidade) {
        super(saldo);
        this.rentabilidade = rentabilidade;
    }

    public void setRentabilidade(float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    @Override
    public float calcularSaldoTotal() {
        return rentabilidade + saldo;
    }
}