package relacionamentos;

import javax.swing.JOptionPane;

public class Produto {
	
	private String nome;
	private double valor;
	private int estoque;
	
	
	@Override
	public String toString() {
		return getNome()+" - "+getEstoque();
	}
	
	public Produto(){
		setNome(JOptionPane.showInputDialog("Nome do produto"));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
		setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Estoque")));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	

}
