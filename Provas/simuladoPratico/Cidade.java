package simuladoPratico;
import javax.swing.JOptionPane;

public class Cidade {
	
	private String nome;
	private int habitantes;
	
	@Override
	public String toString(){
		return getNome() ;
		
	}
	
	public Cidade() {
		setNome(JOptionPane.showInputDialog("Nome da cidade: "));
		setHabitantes(Integer.parseInt(JOptionPane.showInputDialog("N�mero de habitantes: ")));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
}
