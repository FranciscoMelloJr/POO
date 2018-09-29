package Aula10;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {

	private String nome;
	private double divida;
	private double dividaPerfumaria;
	private ArrayList<Medicamento> listaReceita = new ArrayList<Medicamento>();
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+" - "+"Divida: "+getDivida();
	}
	
	public Cliente() {
		setNome(JOptionPane.showInputDialog("Nome do cliente: "));
		setDivida(0);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDivida() {
		return divida;
	}
	public void setDivida(double divida) {
		this.divida = divida;
	}

	public ArrayList<Medicamento> getListaReceita() {
		return listaReceita;
	}

	public void setListaReceita(ArrayList<Medicamento> listaReceita) {
		this.listaReceita = listaReceita;
	}

	public double getDividaPerfumaria() {
		return dividaPerfumaria;
	}

	public void setDividaPerfumaria(double dividaPerfumaria) {
		this.dividaPerfumaria = dividaPerfumaria;
	}
	
}
