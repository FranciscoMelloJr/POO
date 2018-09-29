package contas;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String nome;
	private int idade;
	private char sexo;
	
	public Cliente(){
		cadastra();
	}
	
	public void cadastra(){
		setNome(JOptionPane.showInputDialog("Nome do cliente"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
		setSexo(JOptionPane.showInputDialog("Sexco").charAt(0));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return getNome();
	}

}
