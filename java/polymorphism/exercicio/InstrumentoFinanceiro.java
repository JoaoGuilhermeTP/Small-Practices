public abstract class InstrumentoFinanceiro {
    protected float saldo;

    public InstrumentoFinanceiro(float saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public abstract float calcularSaldoTotal();
}