
public class ContaPoupanša extends Conta {

	
	public ContaPoupanša(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {

		System.out.println("=== Extrato Conta Poupanša ===");
		imprimirInfosComuns();
	}
}
