package simuladoPratico;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Rodovia {

	private String sigla;
	private ArrayList<Cidade> cidadesR = new ArrayList<Cidade>();

	public String toString() {
		return getSigla(); 
	}
	
	
	private static Cidade buscaCidade(ArrayList<Cidade> listacidades) {
		String b = "Selecione a cidade: \n";
		for (int i = 0; i < listacidades.size(); i++)
			b += (i + 1) + " - " + listacidades.get(i) + " \n";
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(b));
		return listacidades.get(escolha - 1);
	}

	public Rodovia(ArrayList<Cidade> listacidades) {
		setSigla(JOptionPane.showInputDialog("Sigla da rodovia: "));
		int op = JOptionPane.YES_NO_OPTION;
		do {
			Cidade c = buscaCidade(listacidades);
			cidadesR.add(c);
			op = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais cidades cortando a rodovia? ", "Atenção",
					op);
		} while (op == 0);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public ArrayList<Cidade> getCidadesR() {
		return cidadesR;
	}

	public void setCidadesR(ArrayList<Cidade> cidadesR) {
		this.cidadesR = cidadesR;
	}
}
