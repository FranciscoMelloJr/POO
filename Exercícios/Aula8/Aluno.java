package Aula8;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;

	@Override
	public String toString() {
		return super.toString()+ " - "+ "N�mero de matricula: " + getMatricula() + "Nome do curso: " + getCurso();
	}

	@Override
	public void cadastra() {
		super.cadastra();
		setMatricula(JOptionPane.showInputDialog("N�mero de matricula: "));
		setCurso(JOptionPane.showInputDialog("Nome do curso: "));
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
