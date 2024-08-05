public class Main {
	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Andrielly");

		Banco banco = new Banco("Banco Digital");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta investimento = new ContaInvestimento(venilton, 0.05);

		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);
		banco.adicionarConta(investimento);

		cc.depositar(100);
		cc.transferir(50, poupanca);
		investimento.depositar(200);
		((ContaInvestimento) investimento).aplicarRendimento();

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimento.imprimirExtrato();

		
	}
}
