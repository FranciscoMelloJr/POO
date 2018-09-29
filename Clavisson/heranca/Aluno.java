package heranca;

import java.util.Scanner;

public class Aluno extends Pessoa{
	private String matricula;
	private String nomeCurso;
	
	@Override
	public String toString() {
		return super.toString()+"-"+getMatricula()+"-"+getNomeCurso();
	}
	
	@Override
	public void cadastra(Scanner s) {
		super.cadastra(s);
		System.out.println("Matrícula:");
		setMatricula(s.nextLine());
		System.out.println("Nome do curso:");
		setNomeCurso(s.nextLine());
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
}
