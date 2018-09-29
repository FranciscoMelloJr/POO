package Aula5;

import java.util.Scanner;

public class Livros {

	String titulo;
	double preço;
	Autor autor = new Autor();
	Scanner s = new Scanner(System.in);

	void cadastraLivro() {

		System.out.println("Título do livro: ");
		setTitulo(s.nextLine());
		System.out.println("Preço do livro: ");
		setPreço(s.nextDouble());
		s.nextLine();
		autor.cadastraAutor();

	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.toLowerCase();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setPreço(double preço) {
		if (preço < 0) {
			System.out.println("Insira um valor válido: ");
			setPreço(s.nextDouble());
		} else
			this.preço = preço;
	}

	public double getPreço() {
		return preço;
	}

	public Autor getAutor() {
		return autor;
	}

	public String mostraLivro() {

		return "Livro: " + getTitulo() + " - R$" + getPreço() + " - Autor: " + autor.mostraAutor();

	}
}
