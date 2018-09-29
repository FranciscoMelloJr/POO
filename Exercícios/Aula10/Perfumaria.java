package Aula10;

public class Perfumaria extends Produto {
	
	private int limite;
	
	public Perfumaria() {
		super();
		setLimite(1000);
	}
	
	@Override
	public boolean vender(Cliente c, int qt) {
		if((getEstoque()>=qt)&(c.getDividaPerfumaria()<getLimite())) {
			setEstoque(getEstoque()-qt);
			double valor = getValor()*qt;
			c.setDivida(c.getDivida()+valor);
			c.setDividaPerfumaria(c.getDividaPerfumaria()+valor);
			return true;
		}else {
			return false;		
		}
	}
	
	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

}
