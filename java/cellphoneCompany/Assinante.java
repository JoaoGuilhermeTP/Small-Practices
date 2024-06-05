public abstract class Assinante {
    protected long cpf;
    protected String nome;
    protected String numero;
    protected Chamada[] chamadas;
    protected int numChamadas;

    public Assinante(long cpf, String nome, String numero) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero = numero;
        this.chamadas = new Chamada[100];
        this.numChamadas = 0;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return String.format("CPF: %d\nNome: %s\nNúmero: %s", cpf, nome,numero);
    }
}