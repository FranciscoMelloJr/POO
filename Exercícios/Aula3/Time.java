package Aula3;

import java.util.ArrayList;
import java.util.Scanner;

public class Time {

	String nome;
	ArrayList<Jogador> jogador = new ArrayList<Jogador>();

	void cadastra(Scanner r) {
		System.out.println("Nome do time: ");
		nome = r.nextLine();
		String op = "";
		do {
			Jogador j = new Jogador();
			j.cadastra(r);
			jogador.add(j);
			System.out.println("Cadastra mais jogadores ?");
			op = r.nextLine().toUpperCase();
		} while (!op.equals("N"));

	}

	String listaJogadores() {
		// percorre a lista
		String ret = "Jogadores do time" + nome + "\n\n";
		for (Jogador j : jogador) {
			ret += j.mostra();
		}
		return ret;
	}

	Jogador artilheiroTime() {
		Jogador a = new Jogador();
		for (Jogador j : jogador) {
			if (j.gols > a.gols) {
				a = j;
			}
		}
		return a;
	}

	int qtGolsTime() {
		int soma = 0;
		for (Jogador j : jogador) {
			soma += j.gols;
		}
		return soma;
	}
}
