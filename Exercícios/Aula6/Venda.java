package Aula6;

import java.util.ArrayList;

public class Venda {

	private ArrayList<Produto> lista = new ArrayList<Produto>();
	
	public boolean vender(Produto p, Cliente c, int qt) {
		if(p.getEstoque()>=qt) {
			p.setEstoque(p.getEstoque()-qt);
			double valor = p.getValor()*qt;
			c.setSaldo(c.getSaldo()+valor);
			lista.add(p);
			return true;
		}else {
			return false;		
		}
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista=lista;
	}
	public ArrayList<Produto> getLista() {
		return lista;
	}
	
}
