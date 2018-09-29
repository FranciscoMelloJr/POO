package Aula6;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String nome;
	private double saldo;
	
	@Override
	public String toString() {
		return getNome()+" - "+getSaldo();
	}
	
	public Cliente() {
		setNome(JOptionPane.showInputDialog("Nome do cliente: "));
		setSaldo(0);
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
