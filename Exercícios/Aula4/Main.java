package Aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
		String loop = "";
		do {
			Disciplina d = new Disciplina();
			d.cadastraDisciplina(s);
			lista.add(d);
			System.out.println("Deseja cadastrar mais disciplinas ? S/N");
			loop = s.nextLine();
			
		}while (loop.equals("S"));
			
		for (int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i).mostraDisciplina());
		}
		
		Disciplina da = new Disciplina();
		for (Disciplina d : lista) {
			if(d.disciplinaAprovada()>da.disciplinaAprovada())
				da = d;
		}
		System.out.println(da.nome+" foi a disciplina com maior aprovação!");
		
		Disciplina pr = new Disciplina();
		for (Disciplina d : lista) {
			if(d.professorReprovado()>pr.professorReprovado())
				pr = d;
		}
		System.out.println(pr.professor+" foi o professor com maior reprovação!");
	}
}
