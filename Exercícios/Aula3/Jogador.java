package Aula3;

import java.util.Scanner;

public class Jogador {

	String nome;
	int numero;
	int gols;

	void cadastra(Scanner r) {
		System.out.println("Nome do jogador: ");
		nome = r.nextLine();
		System.out.println("Número: ");
		numero = r.nextInt();
		System.out.println("Gols: ");
		gols = r.nextInt();
		r.nextLine();

	}

	String mostra() {
		return nome + "-" + numero + "-" + gols + "\n";
	}
}