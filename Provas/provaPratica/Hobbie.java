package provaPratica;
import javax.swing.JOptionPane;

public class Hobbie {

	private String nome;
	
	@Override
	public String toString(){
		return getNome();
	}
	
	public Hobbie() {
		setNome(JOptionPane.showInputDialog("Digite o hobbie: "));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
