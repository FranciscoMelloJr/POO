package provaII;

public class Alimenticio extends Produto {

	public Alimenticio(String nome, double valor, int estoque) {
		super(nome, valor, estoque);
	}

	@Override
	public boolean vender(Cliente c, int qt) {
		if (c.MERCADO == c.getTipo()) {
			return super.vender(c, qt);
		} else
			return false;
	}
}
