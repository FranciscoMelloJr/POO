package Aula4;

import java.util.Scanner;

public class Aluno {
	
	String nome;
	double nota;

	void cadastraAluno (Scanner s) {
		
		System.out.println("Nome do aluno: ");
		nome = s.nextLine();
		System.out.println("Primeira nota do aluno: ");
		double pri = s.nextDouble();
		System.out.println("Segunda nota do aluno: ");
		double seg = s.nextDouble();
		System.out.println("Terceira nota do aluno: ");
		double ter = s.nextDouble();
		s.nextLine();
		nota = ((pri+seg+ter)/3);
	}
	
	String mostraAluno () {
		
		String resultado = "";
		if (nota>=7) {
			resultado = "Aprovado!";
		} else if (nota<=2) {
			resultado = "Reprovado!";
		} else resultado = "Recuperação!";
		
		return nome + " - " + nota + " - " + resultado + "\n";
	}
}
