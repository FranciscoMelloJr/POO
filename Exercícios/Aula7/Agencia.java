package Aula7;

import javax.swing.JOptionPane;

public class Agencia {
	
	private int numero;
	private String cidade;
	private String bairro;
		
	@Override
	public String toString() {
		return "Número da agencia: "+getNumero()+" - "+"Cidade: "+getCidade()+" - "+"Bairro: "+getBairro();
	}
	
	public Agencia() {
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da agência: ")));
		setCidade(JOptionPane.showInputDialog("Nome da cidade: "));
		setBairro(JOptionPane.showInputDialog("Nome do bairro: "));
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}