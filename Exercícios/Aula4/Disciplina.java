package Aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
	
	String nome;
	String professor;
	ArrayList<Aluno> aluno = new ArrayList<Aluno>();

	void cadastraDisciplina (Scanner s) {
		
		System.out.println("Nome da disciplina: ");
		nome = s.nextLine();
		System.out.println("Nome do professor: ");
		professor = s.nextLine();
		String loop = "";
		do {
			Aluno a = new Aluno();
			a.cadastraAluno(s);
			aluno.add(a);
			System.out.println("Cadastrar mais um aluno na disciplina ? S/N");
			loop = s.nextLine();	
		}while (!loop.equals("N"));
				
	}
	
	String mostraDisciplina () {
		
		String ret = "Alunos da disciplina " + " - " + nome + "\n\n";
		for (Aluno a : aluno) {
			ret += a.mostraAluno();
		} 
		return ret;		
	}
	
	int disciplinaAprovada() {
		
		int da=0;
		for (Aluno a : aluno) {
			if(a.nota>7)
				da++;
		}
		return da;
	}
	
	int professorReprovado() {
		
		int pr=0;
		for (Aluno a : aluno) {
			if(a.nota<2)
				pr++;
		}
		return pr;
	}
}
