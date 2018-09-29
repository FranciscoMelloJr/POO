package Aula7;

import java.util.ArrayList;

public class Conta {
	
	private double saldo;
	private Agencia a;
	private Cliente c;

	private static ArrayList<Conta> lista = new ArrayList<Conta>();
	
	public String toString() {
		return getC()+" - "+getA()+" - "+"Saldo: "+getSaldo();
	}
	
	public Conta(Agencia agencia, Cliente cliente) {
		setA(agencia);
		setC(cliente);
		setSaldo(0);
	}

	public boolean saque(Conta c, double vl) {
		if(c.getSaldo()>=vl) {
			c.setSaldo(c.getSaldo()-vl);
			lista.add(c);
			return true;
		}else{
			return false;		
		}
	}
	
	public void deposito(Conta c, double vl) {
		c.setSaldo(c.getSaldo()+vl);
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