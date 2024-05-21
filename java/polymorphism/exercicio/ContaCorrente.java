public class ContaCorrente extends InstrumentoFinanceiro {
    private float limite;

    public ContaCorrente(float saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    @Override
    public float calcularSaldoTotal() {
        return getLimite() + getSaldo();
    }
}