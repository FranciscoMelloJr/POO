package Aula9;

import java.util.ArrayList;

public class Conta {

	protected double saldo;
	protected Agencia a;
	protected Cliente c;
	protected static ArrayList<Conta> lista = new ArrayList<Conta>();

	public String toString() {
		return getC() + " - " + getA() + " - " + "Saldo: " + getSaldo();
	}

	public Conta(Agencia agencia, Cliente cliente) {
		setA(agencia);
		setC(cliente);
		setSaldo(0);
	}

	public boolean saque(Conta c, double vl) {
		if (c.getSaldo() >= vl) {
			c.setSaldo(c.getSaldo() - vl);
			lista.add(c);
			return true;
		} else {
			return false;
		}
	}

	public boolean deposito(Conta c, double vl) {
		c.setSaldo(c.getSaldo() + vl);
		return true;
	}

	public boolean transferenciaI(Conta saque, Conta deposito, double vl) {
		if (saque.getA().equals(deposito.getA()))
			if (saque(saque, vl))
				return true;
		return false;
	}

	public boolean transferenciaF(Conta saque, Conta deposito, double vl) {
		deposito.setSaldo(deposito.getSaldo() + vl);
		return true;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Agencia getA() {
		return a;
	}

	public void setA(Agencia a) {
		this.a = a;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public static ArrayList<Conta> getLista() {
		return lista;
	}

	public static void setLista(ArrayList<Conta> lista) {
		Conta.lista = lista;
	}
}