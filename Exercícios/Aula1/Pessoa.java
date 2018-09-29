package Aula1;

import javax.swing.JOptionPane;

public class Pessoa {

	String nome;
	double peso, altura;

	String mostraImc() {
		return nome + " - " + (peso / (altura * altura)) + "\n";
	}

	void cadastra() {
		nome = JOptionPane.showInputDialog("nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));

	}
}