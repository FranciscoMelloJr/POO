package Aula2;

import java.util.Scanner;

public class Medico {
	
	String nome;
	String especialidade;
	
	void cadastraMedico (Scanner s) {
		System.out.println("Nome do médico: ");
		nome = s.nextLine();
		System.out.println("Especialidade: ");
		especialidade = s.nextLine();
		s.nextLine();
		
	}

	String mostraMedico() {
		
		return nome + " - " + especialidade;
				
	}
}
