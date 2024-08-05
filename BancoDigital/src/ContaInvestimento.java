public class ContaInvestimento extends Conta {

    private double taxaRendimento;

    public ContaInvestimento(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimento ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Taxa de Rendimento: %.2f%%", this.taxaRendimento * 100));
    }
}
