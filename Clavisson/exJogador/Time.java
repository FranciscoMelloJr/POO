package exJogador;

import java.util.ArrayList;
import java.util.Scanner;

public class Time {
	
	String nome;
	ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void cadastra(Scanner s){
		System.out.println("Nome do Time:");
		nome = s.nextLine();
		String op = "";
		do{
			Jogador j = new Jogador();
			j.cadastra(s);
			jogadores.add(j);
			System.out.println("Cadastrar mais jogadores? (S/N)");
			op = s.nextLine().toUpperCase();
		}while(!op.equals("N"));
	}
	
	String listaJogadores(){
		String ret = "Jogadores do time "+nome+"\n\n";
		for (Jogador j : jogadores) {
			ret+=j.mostra();
		}
		return ret;
	}
	
	Jogador artilheiroTime(){
		Jogador a = new Jogador();
		for (Jogador j : jogadores) {
			if(j.gols>a.gols){
				a = j;
			}
		}
		return a;
	}
	
	int qtGolsTime(){
		int soma = 0;
		for (Jogador j : jogadores) {
			soma += j.gols;
		}
		return soma;
	}

}
