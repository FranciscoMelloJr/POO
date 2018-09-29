package Aula10;

import javax.swing.JOptionPane;

public class Medicamento extends Produto {

	private int receita = JOptionPane.YES_NO_OPTION;;
	private String resultado;

	@Override
	public String toString() {
		return super.toString() + " Receita: " + resultado;
	}

	public boolean vender(Cliente c, int qt) {
		int op = JOptionPane.YES_NO_OPTION;
		if (receita == 0) {
			op = JOptionPane.showConfirmDialog(null, "Cliente possui a receita? ", "Atenção!", op);
			if (op == 0) {
				return super.vender(c, qt);
			} else {
				return false;
			}
		} else return super.vender(c, qt);
	}

	public Medicamento() {
		super();
		receita = JOptionPane.showConfirmDialog(null, "O Medicamento necessita de receita médica ?", "Atenção!",
				receita);
		if (receita == 1)
			resultado = "Não";
		else
			resultado = "Sim";
	}
}