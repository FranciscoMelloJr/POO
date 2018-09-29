package Aula8;

import javax.swing.JOptionPane;

public class Pediatra extends Medico {

	private int idMax;

	@Override
	public String toString() {
		return super.toString()+"Idade m�xima: " + getIdMax();
	}

	@Override
	public void cadastra() {
		super.cadastra();
		setIdMax(Integer.parseInt(JOptionPane.showInputDialog("Idade m�xima: ")));
	}

	public int getIdMax() {
		return idMax;
	}
	public void setIdMax(int idMax) {
		this.idMax = idMax;
	}
}
