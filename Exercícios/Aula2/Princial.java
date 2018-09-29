//No programa principal, possibilite o usuário cadastrar N pacientes.
//Mostrar ao final o nome do paciente, a especialidade do médico, o nome e o valor do medicamento.
package Aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Princial {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		ArrayList<Paciente> lista = new ArrayList<Paciente>();
		String loop = "";
		do {
			Paciente p = new Paciente();
			p.cadastraPaciente(s);
			lista.add(p);
			System.out.println("Deseja continuar? S/N");
			loop = s.nextLine();
		} while (loop.equals("S"));
		
		for (int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i).mostraPaciente());
		}
	}
}