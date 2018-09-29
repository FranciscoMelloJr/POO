package simuladoPratico;
import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	private String cidade;
	private int condutor = JOptionPane.YES_NO_OPTION;
	private boolean embragado;

	public Pessoa() {
		setNome(JOptionPane.showInputDialog("Nome da vitima que estava no veiculo: "));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
		setSexo(JOptionPane.showInputDialog("Sexo: ").toUpperCase().charAt(0));
		setCidade(JOptionPane.showInputDialog("Cidade natal: "));
		setCondutor(JOptionPane.showConfirmDialog(null, "Está pessoa era o condutor ?", "Atenção!", condutor));
		int op = JOptionPane.YES_NO_OPTION;
		if (condutor == 0)
			op = JOptionPane.showConfirmDialog(null, "O condutor estava embreagado? ", "Atenção", op);
		if (op == 0)
			setEmbragado(true);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCondutor() {
		return condutor;
	}

	public void setCondutor(int condutor) {
		this.condutor = condutor;
	}

	public boolean isEmbragado() {
		return embragado;
	}

	public void setEmbragado(boolean embragado) {
		this.embragado = embragado;
	}

}
