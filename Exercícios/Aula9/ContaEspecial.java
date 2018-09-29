package Aula9;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
		setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite da conta: ")));
	}

	@Override
	public boolean saque(Conta c, double vl) {
		// super.saque(c, vl);
		if ((c.getSaldo() + getLimite()) >= vl) {
			c.setSaldo(c.getSaldo() - vl);
			lista.add(c);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean transferenciaI(Conta saque, Conta deposito, double vl) {
		if (saque.getA().equals(deposito.getA()))
			if (saque(saque, vl))
				return true;
		return false;
	}

	@Override
	public boolean transferenciaF(Conta saque, Conta deposito, double vl) {
		deposito.setSaldo(deposito.getSaldo() + vl);
		return true;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
