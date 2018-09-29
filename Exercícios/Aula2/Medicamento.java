package Aula2;

import java.util.Scanner;

public class Medicamento {

	String nome;
	String apresentacao;
	double valor;

	void cadastraMedicamento(Scanner r) {
		System.out.println("Nome do medicamento: ");
		nome = r.nextLine();
		System.out.println("Tipo: ");
		apresentacao = r.nextLine();
		System.out.println("Valor: ");
		valor = r.nextDouble();
		r.nextLine();
	}

	String mostraMedicamento() {

		return nome + " - " + valor;

	}
}