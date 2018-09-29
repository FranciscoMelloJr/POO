package Aula10;

public class AcessorioCirurgico extends Produto {

	@Override
	public boolean vender(Cliente c, int qt) {
		setEstoque(getEstoque() - qt);
		double valor = getValor() * qt;
		c.setDivida(c.getDivida() + valor);
		return true;
	}
}
