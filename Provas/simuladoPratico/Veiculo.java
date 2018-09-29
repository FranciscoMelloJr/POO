package simuladoPratico;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Veiculo {

	protected String placa;
	protected int ano;
	protected String cor;
	static protected ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

	public Veiculo() {
		setPlaca(JOptionPane.showInputDialog("Placa do veiculo: "));
		setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação do veiculo: ")));
		setCor(JOptionPane.showInputDialog("Cor do veiculo: "));
		int op = JOptionPane.YES_NO_OPTION;
		do {
			Pessoa p = new Pessoa();
			listaPessoa.add(p);
			op = JOptionPane.showConfirmDialog(null, "Haviam mais vitimas no veiculo ? ", "Atenção", op);
		} while (op == 0);

	}

	public boolean embriaguez() {
		for (Pessoa p : listaPessoa)
			if (p.isEmbragado())
				return true;
		return false;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public static ArrayList<Pessoa> getListaPessoa() {
		return listaPessoa;
	}

	public static void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
		Veiculo.listaPessoa = listaPessoa;
	}

}
