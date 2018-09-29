package provaII;

public class Cliente {

	private String nome;
	private double saldoDevedor;
	private boolean alvara;
	private int tipo;
	public static final int FARMACIA = 1;
	public static final int MERCADO = 2;
	public static final int OUTRO = 3;

	public String toString() {
		return getNome() + ": " + getSaldoDevedor();
	}
	
	public Cliente(String nome, int tipo, double saldoDevedor, boolean alvara) {
		this.nome = nome;
		this.tipo = tipo;
		this.saldoDevedor = saldoDevedor;
		this.alvara = alvara;
	}

	public void pagamento(double vl) {
		setSaldoDevedor(getSaldoDevedor() - vl);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldoDevedor() {
		return saldoDevedor;
	}

	public void setSaldoDevedor(double saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}

	public boolean isAlvara() {
		return alvara;
	}

	public void setAlvara(boolean alvara) {
		this.alvara = alvara;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
