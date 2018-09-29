package Aula7;

import javax.swing.JOptionPane;

public class Cliente {

	private String nome;
	private char sexo;
	private int idade;
	
	public String toString() {
		return "Nome: "+getNome()+" - "+"Sexo: "+getSexo()+" - "+"Idade: "+getIdade();
	}
	
	public Cliente() {
		setNome(JOptionPane.showInputDialog("Nome do cliente: "));
		setSexo(JOptionPane.showInputDialog("Sexo do cliente: ").charAt(0));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do cliente: ")));
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}