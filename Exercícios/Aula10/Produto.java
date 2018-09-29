package Aula10;

import javax.swing.JOptionPane;

public class Produto {

	protected String nome;
	protected double valor;
	protected int estoque;
	
	@Override
	public String toString() {
		return "Nome do produto: "+getNome()+" - "+"Valor: "+getValor()+" - "+"Estoque: "+getEstoque();
	}
	
	public Produto() {
		setNome(JOptionPane.showInputDialog("Nome do produto: "));
		setValor(Integer.parseInt(JOptionPane.showInputDialog("Valor do produto: ")));
		setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque: ")));
	}
	
	public boolean vender(Cliente c, int qt) {
		if(getEstoque()>=qt) {
			setEstoque(getEstoque()-qt);
			double valor = getValor()*qt;
			c.setDivida(c.getDivida()+valor);
			return true;
		}else {
			return false;		
		}
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
