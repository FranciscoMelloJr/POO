package simuladoPratico;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainAcidente {

	private static ArrayList<Acidente> listaAcidente = new ArrayList<Acidente>();
	private static ArrayList<Cidade> listaCidade = new ArrayList<Cidade>();
	private static ArrayList<Rodovia> listaRodovia = new ArrayList<Rodovia>();

	private static void listaAcidenteEmbriaguez() {
		String l = "";
		for (Acidente a : listaAcidente) 
			l+= Acidente.AcidenteEmbriaguez(a)+"\n";
		JOptionPane.showMessageDialog(null, l);
	}
	
	private static void cadastraAcidente() {
		if (listaRodovia.size() >= 1)
			listaAcidente.add(new Acidente(listaRodovia));
		else
			JOptionPane.showMessageDialog(null, "Cadastre no minimo uma rodovia! ");
	}

	private static void cadastraCidade() {
		listaCidade.add(new Cidade());
	}

	private static void cadastraRodovia() {
		if (listaCidade.size() >= 1)
			listaRodovia.add(new Rodovia(listaCidade));
		else
			JOptionPane.showMessageDialog(null, "Cadastre no minimo uma cidade! ");
	}

	public static void main(String[] args) {

		String menu = "\n1 - Cadastrar cidade \n" + "2 - Cadastrar rodovia\n" + "3 - Cadastrar Acidente\n"
				+ "4 - Listar Acidentes por Embriaguez\n" + "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraCidade();
				break;
			case 2:
				cadastraRodovia();
				break;
			case 3:
				cadastraAcidente();
				break;
			case 4:
				listaAcidenteEmbriaguez();
				break;
			}
		} while (op != 5);
	}
}