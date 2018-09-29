package provaII;

public class Produto {

	private String nome;
	private double valor;
	private int estoque;

	public String toString() {
		return getNome() + " - " + getEstoque();
	}
	
	public Produto(String nome, double valor, int estoque) {
		this.nome=nome;
		this.valor=valor;
		this.estoque=estoque;
	}
	
	public boolean vender (Cliente c, int qt) {
		if(qt <= getEstoque()) {
			setEstoque(getEstoque()-qt);
			c.setSaldoDevedor(c.getSaldoDevedor()+getValor()*qt);
			return true;
			
		}	else return false;
	
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