package exJogador;

import java.util.Scanner;

public class Jogador {
	
	String nome;
	int numero,gols;
	
	public void cadastra(Scanner s){
		System.out.println("Nome do Jogador");
		nome= s.nextLine();
		System.out.println("Número da camisa");
		numero= s.nextInt(); s.nextLine();
		System.out.println("Quantidade de Gols");
		gols= s.nextInt(); s.nextLine();
	}
	
	String mostra(){
		return nome+"-"+numero+"-"+gols+"\n";
	}
	

}
