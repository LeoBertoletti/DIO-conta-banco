import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public void removerConta(Conta conta) {
		contas.remove(conta);
	}

	public void imprimirContas() {
		System.out.println("=== Contas do Banco ===");
		for (Conta conta : contas) {
			conta.imprimirExtrato();
		}
	}
}
