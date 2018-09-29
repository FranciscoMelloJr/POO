package Aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalPessoaCarro {

	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		String op = "";
		do {
			Pessoa p = new Pessoa();
			p.cadastra(r);
			lista.add(p);
			System.out.println("Deseja Continuar? (S/N)");
			op = r.nextLine();
		} while (op.equals("S"));
		
		for (int i=0; i<lista.size(); i++){
			System.out.println(lista.get(i).mostraPessoa());
		}
	}
}