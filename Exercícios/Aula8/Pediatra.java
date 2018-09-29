package Aula8;

import javax.swing.JOptionPane;

public class Pediatra extends Medico {

	private int idMax;

	@Override
	public String toString() {
		return super.toString()+"Idade máxima: " + getIdMax();
	}

	@Override
	public void cadastra() {
		super.cadastra();
		setIdMax(Integer.parseInt(JOptionPane.showInputDialog("Idade máxima: ")));
	}

	public int getIdMax() {
		return idMax;
	}
	public void setIdMax(int idMax) {
		this.idMax = idMax;
	}
}
