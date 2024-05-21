public class Main {
    public static void main(String[] args) {
        // Create a new bank
        Banco banco = new Banco();

        // Create a new stock with 100 shares and a balance of 1000
        Acao acao = new Acao(1000, 100);
        banco.adicionar(acao);

        // Create a new checking account with a balance of 500 and a limit of 1000
        ContaCorrente contaCorrente = new ContaCorrente(500, 1000);
        banco.adicionar(contaCorrente);

        // Print the total balance of the bank
        System.out.println("Total balance: " + banco.calcularSaldos());
    }
}