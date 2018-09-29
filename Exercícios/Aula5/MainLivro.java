package Aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLivro {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Livros> lista = new ArrayList<Livros>();
		String loop = "";
		do {
			Livros l = new Livros();
			l.cadastraLivro();
			lista.add(l);
			System.out.println("Deseja cadastrar mais livros ? ");
			loop = s.nextLine();
		} while (loop.equals("S") || loop.equals("s"));

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).mostraLivro());

		}
		String menu = "1 - Pesquisar por autor\n" + "2 - Pesquisar por faixa de valor\n"
				+ "3 - Livros de autores do sexo masculino\n" + "4 - Autores infantis\n" + "5 - Sair";
		int op = 0;
		do {
			System.out.println(menu);
			op = s.nextInt();
			s.nextLine();
			switch (op) {
			case 1:
				System.out.println("Qual autor deseja buscar ?");
				String nome = s.nextLine();
				Livros l = buscaAutor(lista, nome);
				if (l != null) {
					System.out.println(l.mostraLivro());
				} else
					System.out.println("Nome não cadastrado!");
				break;

			}
		} while (op != 5);
	}

	static Livros buscaAutor(ArrayList<Livros> lista, String nome) {
		for (Livros l : lista) {
			if (l.autor.getNome().equals(nome))
				return l;
		}
		return null;
	}
}
