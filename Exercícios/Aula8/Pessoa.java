package Aula8;

import javax.swing.JOptionPane;

public class Pessoa {
	
	protected String nome;
	protected char sexo;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome da pesosa:"));
		setSexo(JOptionPane.showInputDialog("Sexo da pessoa:").charAt(0));
	}

	@Override
	public String toString() {
		return "Nome: "+nome + "Sexo: "+sexo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
