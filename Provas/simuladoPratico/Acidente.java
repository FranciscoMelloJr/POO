package simuladoPratico;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Acidente {

	private Rodovia r;
	private int fatais;
	private int feridas;
	private String mes;
	public static ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

	@Override
	public String toString() {
		return "Rodovia: " + getR() + " - Vitimas fatais: " +getFatais() +" - Feridas: "+getFeridas() + " No mês de "
				+ getMes() + ", envolvendo " + getListaVeiculo();
	}

	public static String AcidenteEmbriaguez(Acidente a) {
		String l = "-----Acidentes por Embriaguez-----\n\n";
		for (Veiculo v : listaVeiculo)
			if (v.embriaguez())
				l += (a + "\n");
			return l;
	}
	
	private static Rodovia buscaR(ArrayList<Rodovia> listaR) {
		String b = "Selecione a rodovia em que ocorreu o acidente: \n";
		for (int i = 0; i < listaR.size(); i++)
			b += (i + 1) + " - " + listaR.get(i) + " \n";
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaR.get(escolha - 1);
	}

	public Acidente(ArrayList<Rodovia> listaR) {
		setR(buscaR(listaR));
		setFatais(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de vitimas fatais: ")));
		setFeridas(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de vitimas feridas: ")));
		setMes(JOptionPane.showInputDialog("Mês em que ocorreu o acidente: "));
		int ope = JOptionPane.YES_NO_OPTION;
		do {
			String menu = "< Tipo de veiculo envolvido >\n" + "1 - Veiculo de carga\n" + "2 - Bicicleta\n";
			int op = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				listaVeiculo.add(new Carga());
				break;
			case 2:
				listaVeiculo.add(new Bicicleta());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inexistente!");
				break;
			}
			ope = JOptionPane.showConfirmDialog(null, "Existe mais veiculos envolvidos no acidente? ", "Atenção", ope);
		} while (ope == 0);

	}

	public Rodovia getR() {
		return r;
	}

	public void setR(Rodovia r) {
		this.r = r;
	}

	public int getFatais() {
		return fatais;
	}

	public void setFatais(int fatais) {
		this.fatais = fatais;
	}

	public int getFeridas() {
		return feridas;
	}

	public void setFeridas(int feridas) {
		this.feridas = feridas;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public static ArrayList<Veiculo> getListaVeiculo() {
		return listaVeiculo;
	}

	public static void setListaVeiculo(ArrayList<Veiculo> listaVeiculo) {
		Acidente.listaVeiculo = listaVeiculo;
	}
}
