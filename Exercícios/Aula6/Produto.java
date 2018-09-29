package Aula6;

import javax.swing.JOptionPane;

public class Produto {
	
	private String nome;
	private int estoque;
	private double valor;
	
	@Override
	public String toString() {
		return getNome()+" - "+getEstoque();
	}
	
	public Produto() {
		setNome(JOptionPane.showInputDialog("Nome do produto: "));
		setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque: ")));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: ")));
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEstoque (int estoque) {
		this.estoque = estoque;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setValor (double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	
}