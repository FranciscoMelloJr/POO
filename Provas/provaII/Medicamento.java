package provaII;

public class Medicamento extends Produto {

	private boolean tarjaPreta;

	public Medicamento(String nome, double valor, int estoque, boolean tarjaPreta) {
		super(nome, valor, estoque);
		this.tarjaPreta = tarjaPreta;
	}

	public boolean vender(Cliente c, int qt) {
		if (c.FARMACIA == c.getTipo()) {
			if (isTarjaPreta()) {
				if (c.isAlvara()) {
					return super.vender(c, qt);
				} else
					return false;
			} else
				return super.vender(c, qt);
			
		} else
			return false;
	}

	public boolean isTarjaPreta() {
		return tarjaPreta;
	}

	public void setTarjaPreta(boolean tarjaPreta) {
		this.tarjaPreta = tarjaPreta;
	}
}