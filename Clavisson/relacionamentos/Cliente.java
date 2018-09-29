package relacionamentos;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String nome;
	private double saldo;
	
	@Override
	public String toString() {
		return getNome()+"-"+getSaldo();
	}
	
	public Cliente(){
		setNome(JOptionPane.showInputDialog("Nome do cliente"));
		setSaldo(0);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
