import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> clt;
		Cliente clt1 = new Cliente();
		Cliente clt2 = new Cliente();
		Cliente clt3 = new Cliente();

		clt1.setNome("Jonas");
		clt2.setNome("Jo�o");
		clt3.setNome("Pedro");
		
		clt = new ArrayList<Cliente>();
		clt.add(clt1);
		clt.add(clt2);
		clt.add(clt3);
		
		System.out.println("=== Lista de clientes ===");
		for(int i = 0; i < clt.size(); i++) {
			System.out.println(clt.get(i).getNome());
		}
		
		ContaCorrente cc1 = new ContaCorrente(clt1);
		cc1.depositar(200);
		ContaPoupan�a cp1 = new ContaPoupan�a(clt1);
		cc1.transferir(100, cp1);

		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
		
		ContaCorrente cc2 = new ContaCorrente(clt2);
		cc2.depositar(400);
		ContaPoupan�a cp2 = new ContaPoupan�a(clt2);
		cc2.transferir(100, cp2);

		cc2.imprimirExtrato();
		cp2.imprimirExtrato();
		
		ContaCorrente cc3 = new ContaCorrente(clt3);
		cc3.depositar(700);
		ContaPoupan�a cp3 = new ContaPoupan�a(clt3);
		cc3.transferir(100, cp3);

		cc3.imprimirExtrato();
		cp3.imprimirExtrato();
	}
}