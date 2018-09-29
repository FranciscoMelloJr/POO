package Aula2;

import java.util.Scanner;

public class Paciente {

	String nome;
	char sexo;
	Medicamento medicamento = new Medicamento();
	Medico medico = new Medico();
	
	void cadastraPaciente (Scanner s) {
		
		System.out.println("Nome do paciente: ");
		nome = s.nextLine();
		System.out.println("Sexo: ");
		sexo = s.next().charAt(0);
		s.nextLine();
		medicamento.cadastraMedicamento(s);
		medico.cadastraMedico(s);
		
	}
	
	String mostraPaciente () {
		
		return nome + " - " + sexo + " - " + medicamento.mostraMedicamento() + " - " + medico.mostraMedico();
	}
}
