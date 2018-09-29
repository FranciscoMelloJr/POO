package Aula1;

import javax.swing.JOptionPane;

public class Carro {

	int ano;
	String placa, modelo;

	void cadastra() {
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do carro: "));
		placa = JOptionPane.showInputDialog("Placa do carro: ");
		modelo = JOptionPane.showInputDialog("Modelo do carro: ");
	}

	String mostraCarro() {

		if (ano < 2016)
			return placa + " - Carro velho\n";
		else
			return placa + " - Carro novo\n";
	}
}