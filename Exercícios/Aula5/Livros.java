package Aula5;

import java.util.Scanner;

public class Livros {

	String titulo;
	double pre�o;
	Autor autor = new Autor();
	Scanner s = new Scanner(System.in);

	void cadastraLivro() {

		System.out.println("T�tulo do livro: ");
		setTitulo(s.nextLine());
		System.out.println("Pre�o do livro: ");
		setPre�o(s.nextDouble());
		s.nextLine();
		autor.cadastraAutor();

	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.toLowerCase();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setPre�o(double pre�o) {
		if (pre�o < 0) {
			System.out.println("Insira um valor v�lido: ");
			setPre�o(s.nextDouble());
		} else
			this.pre�o = pre�o;
	}

	public double getPre�o() {
		return pre�o;
	}

	public Autor getAutor() {
		return autor;
	}

	public String mostraLivro() {

		return "Livro: " + getTitulo() + " - R$" + getPre�o() + " - Autor: " + autor.mostraAutor();

	}
}
